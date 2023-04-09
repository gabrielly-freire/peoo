import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2021
O programa converterá uma temperatura em Fahrenheit para graus Celsius.
De acordo com a formúla:  C = (F–32)*(5/9).
 */

public class Questao09 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a temperatura em Fahrenheit: ");
		double temperaturaF = leia.nextDouble();

		double temperaturaC = (temperaturaF - 32.0) * (5.0 / 9.0);
		System.out.println("A temperatura em Celsius é: " + temperaturaC);

	}

}
