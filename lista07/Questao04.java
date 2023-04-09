package Lista07;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número positivo:");
		int n = leia.nextInt();
		if (n > 0) {
			System.out.println(divisores(n));
		} else {
			System.out.println("Número negativo");
		}
	}

	static int divisores(int n) {
		int cont = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cont++;
			}
		}
		return cont;
	}

}
