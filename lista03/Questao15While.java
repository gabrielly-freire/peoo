import java.util.Random;
import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 27/01/2021
O programa vai gera 1 n�meros aleatorios e o usu�rio tem que adivinhar ou desistir
*/
public class Questao15While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random gerador = new Random();

		int numero = gerador.nextInt(1000);
		int chute = 0;
		int i = 0;
		System.out.println("Para desistir digite um n�mero maior que 1000");

		while (numero != chute) {
			System.out.println("Digite um n�mero entre 0 e 1000:");
			chute = leia.nextInt();
			if (chute > 1000) {
				System.out.println("Voc� tentou " + i + " vezes");
				break;
			}
			if (numero < chute) {
				System.out.println("O n�mero que voc� escolheu � maior do que o n�mero sorteado");
			} else if (numero > chute) {
				System.out.println("O n�mero que voc� escolheu � menor do que o n�mero sorteado");
			} else {
				System.out.println("Parab�ns, Voc� acertou o n�mero!!!");
			}
			i++;
		}
	}

}
