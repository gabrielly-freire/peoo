import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa calcular� o valor total que uma pessoa ir� pagar ao longo de 12 meses por 
um Plano de sa�de, que tem reajuste (aumente) esse valor em 11% uma vez por ano.*/

public class Questao18 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor mensal do seu plano de sa�de: ");
		double plano = leia.nextDouble();
		
		double reajuste = (0.11 * plano) + plano;
		double totalAnual = reajuste * 12;
		System.out.println("Valor total que ir� pagar durante 12 meses: " + totalAnual);

	}
}