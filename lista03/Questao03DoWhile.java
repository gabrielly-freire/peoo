/*Francisca Gabrielly Lopes Freire - 25/01/2021
O programa mostrar� os n�meros naturais divis�veis por 4 e que s�o menores ou igual a 1000
*/
public class Questao03DoWhile {

	public static void main(String[] args) {
		
		int i = 0;
		
		do {
			if (i % 4 == 0) {
				System.out.println("� divis�vel por 4: " + i);
			}
			i++;
		} while (i <= 1000);

	}

}
