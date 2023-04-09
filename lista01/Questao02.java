import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2021
O programa mostrará o antecessor e sucessor de um número digitado pelo usuário.
*/

public class Questao02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = leia.nextInt();

		int antecessor = numero - 1;
		int sucessor = numero + 1;

		System.out.println("O antecessor é: " + antecessor);
		System.out.println("O sucessor é: " + sucessor);
	}
}
