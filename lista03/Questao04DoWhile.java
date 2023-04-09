import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 25/01/2021
O programa mostrará os divisores positivos de um número natural fornecido pelo usuário.
*/
public class Questao04DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = leia.nextInt();
		int i = 1;
		
		do {
			if (n % i == 0) {
				System.out.println("É divisor de " + n + ": " + i);
			}
			i++;
		} while (i <= n);

	}

}
