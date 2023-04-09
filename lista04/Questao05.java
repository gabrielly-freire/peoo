import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade[] = new int[10];
		int maior = 0;
		int posicaoMaior = -1;

		for (int i = 0; i < idade.length; i++) {
			System.out.println("Digite o número " + (i + 1) + ":");
			idade[i] = leia.nextInt();
		}
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] > maior) {
				maior = idade[i];
				posicaoMaior = i;
			}
		}
		System.out.println("Maior idade: " + maior);
		System.out.println("Posição: " + posicaoMaior);
	}

}
