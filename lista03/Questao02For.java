/*Francisca Gabrielly Lopes Freire - 25/01/2021
O programa mostrar� os multiplos de 7 menores que 2000
*/
public class Questao02For {

	public static void main(String[] args) {
		for (int i = 0; i < 2000; i++) {
			if (i % 7 == 0) {
				System.out.println("� multiplo de 7: " + i);
			}
		}
	}

}
