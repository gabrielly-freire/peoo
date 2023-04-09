
import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa converterá quilogramas para libras. Levando em consideração 
que 1Kg é igual a 2,2 libras.*/

public class Questao11 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor em Quilogramas: ");
		double quilogramas = leia.nextDouble();

		double quilogramasLibra = quilogramas * 2.2;
		System.out.println("Valor em Libras: " + quilogramasLibra);

	}
}