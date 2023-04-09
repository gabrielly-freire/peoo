import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2021
O programa calculará a média entre 3 números digitados pelo usuário.
*/

public class Questao01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double numero1 = leia.nextDouble();
		System.out.println("Digite o segundo número: ");
		double numero2 = leia.nextDouble();
		System.out.println("Digite o terceiro número: ");
		double numero3 = leia.nextDouble();

		double media = (numero1 + numero2 + numero3) / 3;

		System.out.println("A média dos números é: " + media);
	}
}
