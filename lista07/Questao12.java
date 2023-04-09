package Lista07;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {

		int[][] matriz = new int[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (i + j);
			}
		}
		maiorNumero(matriz);
	}

	static void maiorNumero(int[][] matriz) {
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("Maior elemento da matriz: " + maior);
	}

}
