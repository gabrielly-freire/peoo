import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire - 19/01/2021
O programa calcular� o valor de certa quantidade de ma��s, considerando que a 
unidade de menos de uma d�zia � 0,30 e uma d�zia ou mais � 0,25
*/

public class Questao01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite quantas ma��s deseja compra: ");
		int maca = leia.nextInt();

		double menorDuzia = 0.30;
		double duzia = 0.25;

		if (maca < 12) {
			double valorMenosDuzia = 0.30 * maca;
			System.out.println("Valor da compra � igua a: R$ " + valorMenosDuzia);
		} else {
			double valorDuzia = 0.25 * maca;
			System.out.println("Valor da compra � igua a: R$ " + valorDuzia);
		}

	}
}
