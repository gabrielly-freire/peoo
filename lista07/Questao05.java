package Lista07;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		int n = leia.nextInt();
		if (n > 0) {
			System.out.println("O n�mero � primo: " + primo(n));
		} else {
			System.out.println("N�mero = 0 ou negativo");
		}
	}

	static boolean primo(int n) {
		int cont = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cont++;
			}
		}
		boolean comparacao = false;
		if (cont == 2) {
			comparacao = true;
		} else {
			comparacao = false;
		}
		return comparacao;

	}

}
