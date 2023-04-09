import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2021
O programa converterá uma temperatura em graus Celsius para Fahrenheit.
De acordo com a formula: F = (9 x C + 160)/5 
 */

public class Questao08 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a temperatura em Celsius: ");
		double temperaturaC = leia.nextDouble();

		double temperaturaF = (9 * temperaturaC + 160) / 5.0;
		System.out.println("A temperatura em Fahrenheit é: " + temperaturaF);

	}
}
