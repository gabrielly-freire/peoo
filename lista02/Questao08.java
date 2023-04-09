import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-19/01/2021
O programa calculará o valor da diaria em um hotel juntamente com a taxa de serviço
*/

public class Questao08 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = leia.nextLine();
		System.out.println("Digite quantas diárias você utilizará no hotel: ");
		int diaria = leia.nextInt();

		double conta = 0;
		double servicos = 0;

		if (diaria >= 4 && diaria <= 7) {
			servicos = 130 * (7.5 / 100);
			conta = servicos + (130 * diaria);
		} else if (diaria > 7) {
			servicos = 130 * (5.0 / 100);
			conta = servicos + (130 * diaria);
		} else if (diaria >= 2 && diaria <= 3) {
			servicos = 130 * (10.0 / 100);
			conta = servicos + (130 * diaria);
		} else {
			servicos = 130 * (15.0 / 100);
			conta = servicos + (130 * diaria);
		}

		System.out.println("Nome do Cliente; " + nome);
		System.out.println("Conta: " + conta);
	}

}
