package Lista07;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		double n1 = leia.nextDouble();
		System.out.println("Digite outro n�mero");
		double n2 = leia.nextDouble();
		System.out.println("Soma dos n�meros: " + soma(n1, n2));
		System.out.println("Subtra��o dos n�meros: " + subtracao(n1, n2));
		System.out.println("Multiplica��o dos n�meros: " + multiplicacao(n1, n2));
		System.out.println("Divis�o dos n�meros: " + divisao(n1, n2));

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
