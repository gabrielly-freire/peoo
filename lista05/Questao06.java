import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[][] m1 = new int[5][5];
		int[][] m2 = new int[5][5];
		int[][] soma = new int[5][5];

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.println("Digite o elemento a" + i + j + " da Matriz 1");
				m1[i][j] = leia.nextInt();
			}
		}
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				System.out.println("Digite o elemento a" + i + j + " da Matriz 2");
				m2[i][j] = leia.nextInt();
			}
		}
		System.out.println("Matriz 1");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matriz 2");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Soma das Matrizes:");
		for (int i = 0; i < soma.length; i++) {
			for (int j = 0; j < soma[i].length; j++) {
				soma[i][j] = m1[i][j] + m2[i][j];
				System.out.print(soma[i][j] + " ");
			}
			System.out.println();
		}
	}

}
