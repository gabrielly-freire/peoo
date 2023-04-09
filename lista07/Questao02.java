package Lista07;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o raio");
		double raio = leia.nextDouble();
		System.out.println("Perimetro do circulo: " + perimetro(raio));

	}

	static double perimetro(double raio) {
		return 2 * Math.PI * raio;
	}
}
