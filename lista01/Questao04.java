import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2019
O programa calcular� a soma entre dois n�mero fornecido pelo usu�rio.
 */

public class Questao04 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		double numero1 = leia.nextDouble();
		System.out.println("Digite mais um n�mero: ");
		double numero2 = leia.nextDouble();

		double soma = numero1 + numero2;

		System.out.println("A soma �: " + soma);
	}
}
