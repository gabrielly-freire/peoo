import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2021
O programa mostrar� o antecessor e sucessor de um n�mero digitado pelo usu�rio.
*/

public class Questao02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int numero = leia.nextInt();

		int antecessor = numero - 1;
		int sucessor = numero + 1;

		System.out.println("O antecessor �: " + antecessor);
		System.out.println("O sucessor �: " + sucessor);
	}
}
