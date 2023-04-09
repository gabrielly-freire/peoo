import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[]v1= new int[10];
		int[]v2= new int[10];
		int[]v3= new int[10];
		
		for (int i = 0; i < v1.length; i++) {
			System.out.println("Digite valores do vetor 1:");
			v1[i]=leia.nextInt();
		}
		for (int i = 0; i < v2.length; i++) {
			System.out.println("Digite valores do vetor 2:");
			v2[i]=leia.nextInt();
		}
		System.out.println("Vetor 3:");
		for (int i = 0; i < v3.length; i++) {
			v3[i]= v1[i]*v2[i];
			System.out.println(v3[i]);
			
		}

	}

}
