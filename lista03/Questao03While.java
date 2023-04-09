/*Francisca Gabrielly Lopes Freire - 25/01/2021
O programa mostrará os números naturais divisíveis por 4 e que são menores ou igual a 1000
*/
public class Questao03While {

	public static void main(String[] args) {
	
		int i = 0;
		
		while (i <= 1000) {
			if (i % 4 == 0) {
				System.out.println("É divisível por 4: " + i);
			}
			i++;
		}
	}

}
