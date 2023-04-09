import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] a1 = new int[8];
		int[] a2 = new int[8];
		int[]a1Novo=new int[8];
		int[]a2Novo=new int[8];

		for (int i = 0; i < a1.length; i++) {
			System.out.println("Digite os o vetor A1:");
			a1[i]= leia.nextInt();
		}
		for (int i = 0; i < a2.length; i++) {
			System.out.println("Digite os o vetor A2:");
			a2[i]= leia.nextInt();
		}
		System.out.println("Novo A1");
		for (int i = 0; i < a1.length; i++) {
			a1Novo=a2;
			System.out.println(a1Novo[i]);
		}
		System.out.println("Novo A2");
		for (int i = 0; i < a2.length; i++) {
			a2Novo=a1;
			System.out.println(a2Novo[i]);
		}
	}

}
