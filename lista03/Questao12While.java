import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa calcular� a multiplica��o de dois numeros digitados
*/
public class Questao12While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero 1:");
		int n1 = leia.nextInt();
		System.out.println("Digite o numero 2:");
		int n2 = leia.nextInt();
		int i = 1;
		int soma = 0;
		
		while (i <= n1) {
			soma = soma + n2;
			i++;
		}
		System.out.println("A multiplica��o de " + n1 + " e " + n2 + ": " + soma);
	}

}