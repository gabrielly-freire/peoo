import java.util.Random;
import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 27/01/2021
O programa vai gera 1 números aleatorios e o usuário tem que adivinhar ou desistir
*/
public class Questao15While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random gerador = new Random();

		int numero = gerador.nextInt(1000);
		int chute = 0;
		int i = 0;
		System.out.println("Para desistir digite um número maior que 1000");

		while (numero != chute) {
			System.out.println("Digite um número entre 0 e 1000:");
			chute = leia.nextInt();
			if (chute > 1000) {
				System.out.println("Você tentou " + i + " vezes");
				break;
			}
			if (numero < chute) {
				System.out.println("O número que você escolheu é maior do que o número sorteado");
			} else if (numero > chute) {
				System.out.println("O número que você escolheu é menor do que o número sorteado");
			} else {
				System.out.println("Parabéns, Você acertou o número!!!");
			}
			i++;
		}
	}

}
