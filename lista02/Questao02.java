import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire - 19/01/2021
O programa verificar� se um n�mero est� no invervalo de 0 � 100
*/

public class Questao02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		double numero = leia.nextDouble();

		if (0 <= numero && numero <= 100) {
			System.out.println("Voc� digitou um n�mero entre 0 e 100");
		} else {
			System.out.println("Voc� digitou um n�mero fora do intervalo entre 0 e 100");
		}

	}

}
