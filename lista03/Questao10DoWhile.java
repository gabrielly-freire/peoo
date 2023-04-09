import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa mostrará quantos números digitados estão no intervalo de 0 a 100 
e quantos estão fora
*/
public class Questao10DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int contador1 = 0;
		int contador2 = 0;
		int i = 0;

		do {
			int n = leia.nextInt();
			if (n >= 0 && n <= 100) {
				contador1++;
			} else {
				contador2++;
			}
		} while (i <= 10);
		System.out.println("Quantidade de números no intervalor de 0 a 100: " + contador1);
		System.out.println("Quantidade de números fora do intervalor de 0 a 100: " + contador2);
	}

}
