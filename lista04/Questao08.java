import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o número de lançamentos");

		int n = leia.nextInt();
		int[] l = new int[n];
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		int cont5 = 0;
		int cont6 = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o valor do dado");
			l[i] = leia.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (l[i] == 1) {
				cont1++;
			} else if (l[i] == 2) {
				cont2++;
			} else if (l[i] == 3) {
				cont3++;
			} else if (l[i] == 4) {
				cont4++;
			} else if (l[i] == 5) {
				cont5++;
			} else if (l[i] == 6) {
				cont6++;
			}
		}
		System.out.println("Quantidade de vezes que apareceu o valor 1: " + cont1);
		System.out.println("Quantidade de vezes que apareceu o valor 2: " + cont2);
		System.out.println("Quantidade de vezes que apareceu o valor 3: " + cont3);
		System.out.println("Quantidade de vezes que apareceu o valor 4: " + cont4);
		System.out.println("Quantidade de vezes que apareceu o valor 5: " + cont5);
		System.out.println("Quantidade de vezes que apareceu o valor 6: " + cont6);
	}

}
