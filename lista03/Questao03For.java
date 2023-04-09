/*Francisca Gabrielly Lopes Freire - 25/01/2021
O programa mostrará os números naturais divisíveis por 4 e que são menores ou igual a 1000
*/
public class Questao03For {

	public static void main(String[] args) {

		for (int i = 0; i <= 1000; i++) {
			if (i % 4 == 0) {
				System.out.println("É divisível por 4: "+i);
			}
		}

	}
}