import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2021
O programa apresentar� os valores da velocidade m�dia, tempo gasto na viagem, 
a dist�ncia percorrida e a quantidade de litros utilizada na viagem.
 */

public class Questao06 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a velocidade m�dia da viagem: ");
		double velocidade = leia.nextDouble();
		System.out.println("Digite o tempo gasto durante a viagem: ");
		double tempo = leia.nextDouble();

		double distancia = tempo * velocidade;
		double litros = distancia / 12;

		System.out.println("A velocidade m�dia �: " + velocidade);
		System.out.println("O tempo gasto na viagem: " + tempo);
		System.out.println("A distancia percorrida: " + distancia);
		System.out.println("Quantidade de litros de gasolina utilizada: " + litros);

	}
}
