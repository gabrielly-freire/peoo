import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n[] = new int[10];
		int maior = Integer.MIN_VALUE;
		int posicaoMaior = -1;
		int menor = Integer.MAX_VALUE;
		int posicaoMenor = -1;

		for (int i = 0; i < n.length; i++) {
			System.out.println("Digite o número " + (i + 1) + ":");
			n[i] = leia.nextInt();
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i] > maior) {
				maior = n[i];
				posicaoMaior = i;
			}
			if (n[i] < menor) {
				menor = n[i];
				posicaoMenor = i;
			}
		}
		
		System.out.println("Menor idade: " + menor);
		System.out.println("Posição: " + posicaoMenor);
		System.out.println("Maior idade: " + maior);
		System.out.println("Posição: " + posicaoMaior);
	}

}
