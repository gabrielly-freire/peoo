import java.util.Random;
/*Francisca Gabrielly Lopes Freire - 27/01/2021
O programa vai gera 20 n�meros aleatorios e vai mostrar quais dividos por 11 tem resto 5
*/
public class Questao14For {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		for (int i = 1; i <= 20; i++) {
			int n = gerador.nextInt(3000);
			if (n % 11 == 5) {
				System.out.println("N�meros dividos por 11 com resto 5: " + n);
			}
		}

	}

}
