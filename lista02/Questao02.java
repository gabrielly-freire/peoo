import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire - 19/01/2021
O programa verificará se um número está no invervalo de 0 à 100
*/

public class Questao02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double numero = leia.nextDouble();

		if (0 <= numero && numero <= 100) {
			System.out.println("Você digitou um número entre 0 e 100");
		} else {
			System.out.println("Você digitou um número fora do intervalo entre 0 e 100");
		}

	}

}
