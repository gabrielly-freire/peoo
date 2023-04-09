import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2021
O programa vai ler o saldo de uma conta bancária e retornar
o valor do saldo com um reajuste de 7,5%.*/

public class Questao10 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o saldo da sua conta: ");
		double saldo = leia.nextDouble();

		double reajuste = saldo * (7.5 / 100);
		double novoSaldo = saldo + reajuste;
		System.out.println("Seu saldo com reajuste é: " + novoSaldo);
	}
}
