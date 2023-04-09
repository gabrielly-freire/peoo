import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa calculará a tabuada de algum número digitado 
*/
public class Questao08For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int n = leia.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + " " + i + " = " + n*i);
		}

	}

}
