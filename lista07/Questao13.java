package Lista07;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[4][4];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (i + j)*2;
			}
		}

		matriz(matriz);

	}

	static void matriz(int[][] matriz) {
		int soma = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				if (i < j) {
					soma += matriz[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println("Soma dos elemento acima da diagonal principal: "+soma);
	}

}
