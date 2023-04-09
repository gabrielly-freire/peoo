import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-20/01/2021
O programa calculará a duração do jogo
*/

public class Questao05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a hora do início do jogo: ");
		int inicio = leia.nextInt();
		System.out.println("Digite a hora do final do jogo: ");
		int fim = leia.nextInt();
		int duracao = 0;

		if (inicio > fim) {
			duracao = (24 - inicio) + fim;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else if (inicio < fim) {
			duracao = fim - inicio;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}

	}

}
