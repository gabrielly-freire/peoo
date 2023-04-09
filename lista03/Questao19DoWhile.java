import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 27/01/2021
O programa somará os numeros digitados
*/
public class Questao19DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double soma = 0;
		int numero = 0;
		int i = 0;
		System.out.println("Para finalizar digite 9999");
		
		do {
			System.out.println("Digite um número:");
			numero = leia.nextInt();
			if (numero != 9999) {
				soma = soma + numero;
				i++;
			}
		}while (numero != 9999);
		
		double media = soma / i;
		System.out.println("A soma dos números digitados é " + soma);
		System.out.println("a média dos números digitados é " + media);

	}

}
