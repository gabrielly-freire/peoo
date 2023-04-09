package Lista07;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número:");
		int n = leia.nextInt();
		if (n > 0 || n == 0) {
			System.out.println("Fatorial do número " + n + ": " + fatorial(n));
		} else {
			System.out.println("O número digitado não é natural");
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
