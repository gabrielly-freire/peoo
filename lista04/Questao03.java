import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] n = new int[20];
		int cont = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.println("Digite um n�mero:");
			n[i] = leia.nextInt();
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i] % 2 == 0) {
				cont++;
				System.out.println("N�meros pares: " + n[i]);
			}
		}
		System.out.println("Quantidade de n�meros pares: " + cont);
	}

}
