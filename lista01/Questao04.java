import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2019
O programa calculará a soma entre dois número fornecido pelo usuário.
 */

public class Questao04 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		double numero1 = leia.nextDouble();
		System.out.println("Digite mais um número: ");
		double numero2 = leia.nextDouble();

		double soma = numero1 + numero2;

		System.out.println("A soma é: " + soma);
	}
}
