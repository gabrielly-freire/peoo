import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2021
O programa calcular� a m�dia entre 3 n�meros digitados pelo usu�rio.
*/

public class Questao01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		double numero1 = leia.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		double numero2 = leia.nextDouble();
		System.out.println("Digite o terceiro n�mero: ");
		double numero3 = leia.nextDouble();

		double media = (numero1 + numero2 + numero3) / 3;

		System.out.println("A m�dia dos n�meros �: " + media);
	}
}
