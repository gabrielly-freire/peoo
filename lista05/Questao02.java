import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		char[][] matriz = new char[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite um número ou uma letra");
				matriz[i][j] = leia.next().charAt(0);
			}
		}
		for (int i = matriz.length - 1; i >= 0; i--) {
			for (int j = matriz[i].length - 1; j >= 0; j--) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
