package Lista07;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de linhas");
		int linhas=leia.nextInt();
		System.out.println("Digite a quantidade de colunas");
		int colunas = leia.nextInt();
		String [][]matriz= new String[linhas][colunas];
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.println("Digite o elemente a"+i+j);
				matriz[i][j]=leia.next();
			}
		}
		
		matriz(matriz);
		
	}
	static void matriz(String[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}
