import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa mostrar� quantos n�meros digitados est�o no intervalo de 0 a 100 
e quantos est�o fora
*/
public class Questao10For {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n = 0;
		int contador1 = 0;
		int contador2 = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o numero " + i + ":");
			n = leia.nextInt();
			if (n >= 0 && n <= 100) {
				contador1++;
			} else {
				contador2++;
			}
		}

		System.out.println("Quantidade de n�meros no intervalor de 0 a 100: " + contador1);
		System.out.println("Quantidade de n�meros fora do intervalor de 0 a 100: " + contador2);

	}
}
