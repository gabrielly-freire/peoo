import java.util.Scanner;

import java.util.Arrays;

public class Questao07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Digite um número:");

		int x = leia.nextInt();
		String estado = null;

		for (int i = 0; i < vetorA.length; i++) {
			if (x == vetorA[i]) {
				estado = "Número encontrado";
			}
		}
		if (estado == "Número encontrado") {
			System.out.println(estado);
		} else {
			System.out.println("Número não encontrado");

		}
	}

}
