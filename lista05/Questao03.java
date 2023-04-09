import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite um número");
				matriz[i][j] = leia.nextInt();
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elementos da diagonal Principal:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					System.out.print(matriz[i][j]+" ");
				}
			}
		}

	}

}
