import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa calculará o valor total do lanche(coxinhas, pastéis e refrigerantes) de um aluno
e o percentual de 5% do valor total do lanche. De acordo com os valores de cada lanche comprado:
1 coxinha = R$ 1,75;1 pastel = R$ 1,50; e 1 refrigerante = R$ 2,50*/

public class Questao13 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a quantidade de coxinhas comprada: ");
		double coxinha = leia.nextDouble() * 1.75;
		System.out.println("Digite a quantidade de pastéis comprado: ");
		double pastel = leia.nextDouble() * 1.50;
		System.out.println("Digite a quantidade de refrigerantes comprado: ");
		double refrigerante = leia.nextDouble() * 2.50;

		double total = coxinha + pastel + refrigerante;
		double percentual = total * 0.05;
		System.out.println("O valor total pago pelo lanche: " + total);
		System.out.println("Percentual de 5% do valor total: " + percentual);

	}

}