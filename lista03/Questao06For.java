import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa calculará o fatorial de um numero digitado pelo usuario
*/
public class Questao06For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número natural:");
		int n = leia.nextInt();
		int resultado = 1;
		
		for (int i = 1; i <= n; i++) {
			resultado = i * resultado;
		}
		if (n == 0 || n == 1) {
			System.out.println("Resultado em fatorial igual a 1");
		} else {
			System.out.println("Resultado em fatorial igual a " + resultado);
		}
	}

}
