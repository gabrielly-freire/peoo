import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 25/01/2021
O programa mostrar� os divisores positivos de um n�mero natural fornecido pelo usu�rio.
*/
public class Questao04For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int n = leia.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println("� divisor de " + n + ": " + i);
			}
		}

	}

}
