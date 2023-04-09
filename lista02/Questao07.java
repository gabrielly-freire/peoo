import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-20/01/2021
O programa calculará o valor de um salário com ajuste 
*/

public class Questao07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor do seu sálario atual");
		double salarioAtual = leia.nextDouble();
		double novoSalario = 0;

		if (1500 > salarioAtual) {
			novoSalario = salarioAtual + salarioAtual * (15 / 100.0);
			System.out.println("O valor do salario com ajuste é: " + novoSalario);
		} else if (1500 <= salarioAtual && salarioAtual < 1750) {
			novoSalario = salarioAtual + salarioAtual * (12 / 100.0);
			System.out.println("O valor do salario com ajuste é: " + novoSalario);
		} else if (1750 <= salarioAtual && salarioAtual < 2000) {
			novoSalario = salarioAtual + salarioAtual * (10 / 100.0);
			System.out.println("O valor do salario com ajuste é: " + novoSalario);
		} else if (2000 <= salarioAtual && salarioAtual < 3000) {
			novoSalario = salarioAtual + salarioAtual * (7.5 / 100.0);
			System.out.println("O valor do salario com ajuste é: " + novoSalario);
		} else {
			novoSalario = salarioAtual + salarioAtual * (5 / 100.0);
			System.out.println("O valor do salario com ajuste é: " + novoSalario);
		}

	}

}
