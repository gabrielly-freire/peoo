import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-19/01/2021
O programa vai ler o código do produto e calculará o valor total
*/

public class Questao11 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Código    Item        Preço unitário");
		System.out.println("200       Chuteira    R$ 159,99");
		System.out.println("301       Meião       R$ 14,99");
		System.out.println("102       Camiseta    R$ 59,99");
		System.out.println("403       Calção      R$ 29,99");

		System.out.println("Digite um código: ");
		int codigo = leia.nextInt();
		System.out.println("Quantas unidades: ");
		int unidade = leia.nextInt();
		double valor = 0;

		switch (codigo) {
		case 200:
			valor = 159.99 * unidade;
			break;
		case 301:
			valor = 14.99 * unidade;
			break;
		case 102:
			valor = 59.99 * unidade;
			break;
		case 403:
			valor = 29.99 * unidade;
			break;
		}
		System.out.println("Valor da compra R$ " + valor);
	}
}
