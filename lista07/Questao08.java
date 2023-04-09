package Lista07;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite algo:");
		String frase = leia.nextLine();
		invertido(frase);

	}
	static void invertido(String frase) {
		char[] vetor = frase.toCharArray();
		
		System.out.println("Invertido:");
		for (int i = vetor.length-1; i >=0 ; i--) {
			System.out.print(vetor[i]);			
		}
		
	}

}
