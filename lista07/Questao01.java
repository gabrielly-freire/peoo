package Lista07;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número");
		double n1 = leia.nextDouble();
		System.out.println("Digite outro número");
		double n2 = leia.nextDouble();
		System.out.println("Soma dos números: " + soma(n1, n2));
		System.out.println("Subtração dos números: " + subtracao(n1, n2));
		System.out.println("Multiplicação dos números: " + multiplicacao(n1, n2));
		System.out.println("Divisão dos números: " + divisao(n1, n2));

	}

	static double soma(double n1, double n2) {
		return n1 + n2;
	}

	static double subtracao(double n1, double n2) {
		return n1 - n2;
	}

	static double multiplicacao(double n1, double n2) {
		return n1 * n2;
	}

	static double divisao(double n1, double n2) {
		return  n1 / n2;
	}

}
