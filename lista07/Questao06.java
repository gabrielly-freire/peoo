package Lista07;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero:");
		int n = leia.nextInt();
		if (n > 0 || n == 0) {
			System.out.println("Fatorial do n�mero " + n + ": " + fatorial(n));
		} else {
			System.out.println("O n�mero digitado n�o � natural");
		}
	}

	static int fatorial(int n) {
		int calculo = 1;
		
		if (n == 0 || n == 1) {
			calculo = 1;
		} else {
			for (int i = 1; i <= n; i++) {
				calculo = calculo * i;
			}
		}
		return calculo;
	}

}
