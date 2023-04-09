import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire - 19/01/2021
O programa calculará o valor de certa quantidade de maçãs, considerando que a 
unidade de menos de uma dúzia é 0,30 e uma dúzia ou mais é 0,25
*/

public class Questao01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite quantas maçãs deseja compra: ");
		int maca = leia.nextInt();

		double menorDuzia = 0.30;
		double duzia = 0.25;

		if (maca < 12) {
			double valorMenosDuzia = 0.30 * maca;
			System.out.println("Valor da compra é igua a: R$ " + valorMenosDuzia);
		} else {
			double valorDuzia = 0.25 * maca;
			System.out.println("Valor da compra é igua a: R$ " + valorDuzia);
		}

	}
}
