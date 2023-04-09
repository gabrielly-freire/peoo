import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double[][] matriz = { { 2.2, 1.5, 6.6 }, { 1, 2, 3 }, { 0.5, 0.99, 0 } };

		System.out.println("Digite um número");
		double n = leia.nextDouble();

		String estado = null;
		int posicaoLinha = 0;
		int posicaoColuna = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (n == matriz[i][j]) {
					estado = "Número encontrado!";
					posicaoLinha = i;
					posicaoColuna = j;
				}
			}
		}
		if (estado == "Número encontrado!") {
			System.out.println(estado);
			System.out.println("Linha: " + posicaoLinha + " Coluna: " + posicaoColuna);
		} else {
			System.out.println("Número não encontrado");
		}

	}

}
