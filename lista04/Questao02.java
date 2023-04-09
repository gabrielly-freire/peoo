import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n[] = new int[10];

		for (int i = 0; i < n.length; i++) {
			System.out.println("Digite um número");
			n[i] = leia.nextInt();
		}
		for (int i = n.length - 1; i >= 0; i--) {
			System.out.println("Ordem inversa dos numeros digitados " + (i + 1) + "º: " + n[i]);
		}

	}

}
