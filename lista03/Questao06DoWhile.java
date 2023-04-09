import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa calculará o fatorial de um numero digitado pelo usuario
*/
public class Questao06DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = leia.nextInt();
		int i = 1;
		int resultado = 1;
		
		do {
			resultado = resultado * i;
			i++;
		}while(i<=n);
		if (n == 0 || n == 1) {
			System.out.println("Resultado em fatorial igual a: 1");
		} else {
			System.out.println("Resultado em fatorial igual a: "+ resultado);
		}

	}

}
