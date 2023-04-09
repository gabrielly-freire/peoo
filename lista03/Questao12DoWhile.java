import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa calculará a multiplicação de dois numeros digitados
*/
public class Questao12DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o numero 1:");
		int n1 = leia.nextInt();
		System.out.println("Digite o numero 2:");
		int n2 = leia.nextInt();
		int i = 1;
		int soma = 0;

		do {
			soma = soma + n2;
			i++;
		} while (i <= n1);
		System.out.println("A multiplicação de " + n1 + " e " + n2 + ": " + soma);

	}

}
