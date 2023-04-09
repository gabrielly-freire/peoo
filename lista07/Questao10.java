package Lista07;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double[] vetor = { 1, 0.5, 0.25, 8.9, 5.5 };

		System.out.println("Digite um  para ser procurando no vetor:");
		double n = leia.nextDouble();
		System.out.println("O número " + n + " se encontra na posição: " + busca(n, vetor));

	}

	static int busca(double n, double[] vetor) {
		int posicao = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (n == vetor[i]) {
				posicao = i;
				break;
			} else {
				posicao = -1;
			}
		}
		return posicao;
	}

}
