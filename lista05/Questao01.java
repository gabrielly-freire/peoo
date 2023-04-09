import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de linhas:");
		int linhas = leia.nextInt();
		System.out.println("Digite a quantidade de colunas:");
		int colunas = leia.nextInt();
		
		String [][]matriz= new String [linhas][colunas];
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.println("Digite um número ou letra(s): ");
				matriz[i][j]= leia.next();
			}
		}
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}

	}

}
