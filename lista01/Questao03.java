import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2021
O programa mostrar� a quinta pot�ncia e a raiz quadrada de um n�mero digitado pelo usu�rio.
 */

public class Questao03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		double numero = leia.nextDouble();

		double potencia = Math.pow(numero, 5);
		double raiz = Math.sqrt(numero);

		System.out.println("O n�mero digitado elevado a quinta pot�ncia � igua a: " + potencia);
		System.out.println("a raiz do n�mero digitado � igua a " + raiz);
	}

}
