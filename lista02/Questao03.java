import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire - 19/01/2021
O programa verificará se o ano é bissexto
*/

public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um ano: ");
		int ano = leia.nextInt();

		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("É um ano bissexto!");
		} else {
			System.out.println("Não é um ano bissexto!");
		}

	}

}
