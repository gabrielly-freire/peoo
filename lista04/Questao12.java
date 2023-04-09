import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] a1 = new int[10];
		double[] a2 = new double[10];
		double[] quadrado = new double[10];

		for (int i = 0; i < a1.length; i++) {
			System.out.println("Digite os números do vetor 1:");
			a1[i] = leia.nextInt();
		}
		
		System.out.println("Números do vetor 2:");
		for (int i = 0; i < a2.length; i++) {
			a2[i] = Math.pow(a1[i], 3);
			System.out.println(a2[i]);
		}
		for (int i = 0; i < a1.length; i++) {
			quadrado[i] = Math.pow(a1[i], 2);
			System.out.println("Quadrado dos números do vetor 1: " + quadrado[i]);
		}
		for (int i = 0; i < a2.length; i++) {
			quadrado[i] = Math.pow(a2[i], 2);
			System.out.println("Quadrado dos números do vetor 2: " + quadrado[i]);

		}

	}
}
