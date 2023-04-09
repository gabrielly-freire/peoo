import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa calculará a multiplicação de dois numeros digitados
*/
public class Questao12For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o numero 1:");
		int n1 = leia.nextInt();
		System.out.println("Digite o numero 2:");
		int n2 = leia.nextInt();
		int soma = 0;

		for (int i = 1; i <= n1; i++) {
			soma = soma + n2;
		}
		System.out.println("A multiplicação de " + n1 + " e " + n2 + ": " + soma);
	}

}
