import java.util.Iterator;
import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] n = new int[20];

		for (int i = 0; i < n.length; i++) {
			System.out.println("Digite um número:");
			n[i] = leia.nextInt();
		}
		
		for (int i = 0; i < n.length / 2; i++) {
			
			int ultimasPosicao = n.length - i;
			
			if (i < n.length / 2) {
				System.out.println(ultimasPosicao);
			}
		}
		
		for (int i = (n.length / 2)-1; i >= 0; i--) {
			
			if (i < n.length / 2) {
				System.out.println(n[i]);
			} 
		}
		
	}
}
