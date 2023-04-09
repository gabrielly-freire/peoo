import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 27/01/2021
O programa mostrará quantos dos numeros digitados sao impares e pares
*/
public class Questao20While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int i = 0;
		int j = 0;
		int numero = 0;
		System.out.println("Para finalizar digite -1");
		
		while (numero != -1) {
			System.out.println("Digite um número:");
			numero = leia.nextInt();
			if (numero % 2 == 0 && numero > 0) {
				i++;
			}
			if (numero % 2 != 0 && numero > 0) {
				j++;
			}
			if (numero == -1) {
				System.out.println("Foi digitado " + i + " números pares");
				System.out.println("Foi digitado " + j + " números impares");

			}
		}

	}

}
