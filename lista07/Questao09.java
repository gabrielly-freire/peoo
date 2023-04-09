package Lista07;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double[] vetor = { 1, 0.5, 0.25, 8.9, 5.5 };

		System.out.println("Digite um  para ser procurando no vetor:");
		double n = leia.nextDouble();
		System.out.println("O número " + n + " se encontra no vetor: " + busca(n, vetor));

	}

	static boolean busca(double n, double[] vetor) {
		boolean comparacao = false;

		for (int i = 0; i < vetor.length; i++) {
			if (n == vetor[i]) {
				comparacao = true;
				break;
			} else {
				comparacao = false;
			}
		}
		return comparacao;
	}

}
