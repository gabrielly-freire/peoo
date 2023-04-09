package Lista07;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o raio");
		double raio = leia.nextDouble();
		System.out.println("Área do circulo " + area(raio));
	}

	static double area(double raio) {
		return Math.pow(raio, 2) * Math.PI;
	}
}
