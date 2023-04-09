import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[6][6];
		int[] v1 = new int[12];
		int[] v2 = new int[matriz.length];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite o elemento a" + i + j + " da Matriz 1");
				matriz[i][j] = leia.nextInt();
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elementos das linhas pares: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i % 2 == 0 && i != 0) {
					v1[i] = matriz[i][j];
					System.out.print(v1[i] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("Elementos da diogonal Principal: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					v2[i] = matriz[i][j];
					System.out.print(v2[i] + " ");
				}
			}
		}
	}

}
