import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2021
O programa mostrará a quinta potência e a raiz quadrada de um número digitado pelo usuário.
 */

public class Questao03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		double numero = leia.nextDouble();

		double potencia = Math.pow(numero, 5);
		double raiz = Math.sqrt(numero);

		System.out.println("O número digitado elevado a quinta potência é igua a: " + potencia);
		System.out.println("a raiz do número digitado é igua a " + raiz);
	}

}
