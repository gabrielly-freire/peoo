
import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa converter� quilogramas para libras. Levando em considera��o 
que 1Kg � igual a 2,2 libras.*/

public class Questao11 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor em Quilogramas: ");
		double quilogramas = leia.nextDouble();

		double quilogramasLibra = quilogramas * 2.2;
		System.out.println("Valor em Libras: " + quilogramasLibra);

	}
}