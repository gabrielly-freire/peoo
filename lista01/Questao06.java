import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2021
O programa apresentará os valores da velocidade média, tempo gasto na viagem, 
a distância percorrida e a quantidade de litros utilizada na viagem.
 */

public class Questao06 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a velocidade média da viagem: ");
		double velocidade = leia.nextDouble();
		System.out.println("Digite o tempo gasto durante a viagem: ");
		double tempo = leia.nextDouble();

		double distancia = tempo * velocidade;
		double litros = distancia / 12;

		System.out.println("A velocidade média é: " + velocidade);
		System.out.println("O tempo gasto na viagem: " + tempo);
		System.out.println("A distancia percorrida: " + distancia);
		System.out.println("Quantidade de litros de gasolina utilizada: " + litros);

	}
}
