import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n[] = new int[10];
		int maior = 0;
		int posicaoMaior = -1;

		for (int i = 0; i < n.length; i++) {
			System.out.println("Digite o número " + (i + 1) + ":");
			n[i] = leia.nextInt();
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i] > maior) {
				maior = n[i];
				posicaoMaior = i;
			}
		}
		
		int ultima = n[n.length-1];

		for (int i = 0; i < n.length; i++) {
			if(n[i]==n[posicaoMaior]) {
				System.out.println(ultima);
			}else if(n[i]==n[n.length-1]) {
				System.out.println(maior);
			}else {
				System.out.println(n[i]);
			}
		}

		/*
		 * System.out.println(n[n.length-1]);//ultimo elemento
		 * System.out.println(n.length-1);//posicao ultima
		 * System.out.println(maior);//maior elemento
		 * System.out.println(posicaoMaior);//posição do maior
		 */

		
	}
}
