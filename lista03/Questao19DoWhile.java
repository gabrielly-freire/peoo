import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 27/01/2021
O programa somar� os numeros digitados
*/
public class Questao19DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double soma = 0;
		int numero = 0;
		int i = 0;
		System.out.println("Para finalizar digite 9999");
		
		do {
			System.out.println("Digite um n�mero:");
			numero = leia.nextInt();
			if (numero != 9999) {
				soma = soma + numero;
				i++;
			}
		}while (numero != 9999);
		
		double media = soma / i;
		System.out.println("A soma dos n�meros digitados � " + soma);
		System.out.println("a m�dia dos n�meros digitados � " + media);

	}

}
