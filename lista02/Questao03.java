import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire - 19/01/2021
O programa verificar� se o ano � bissexto
*/

public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um ano: ");
		int ano = leia.nextInt();

		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("� um ano bissexto!");
		} else {
			System.out.println("N�o � um ano bissexto!");
		}

	}

}
