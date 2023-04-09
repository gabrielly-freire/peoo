/*Francisca Gabrielly Lopes Freire - 27/01/2021
O programa mostrará a tabuada do 1 ao 10
*/
public class Questao17DoWhile {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		do {
			do {
				System.out.println(i + " x " + j + " = " + i * j);
				j++;
			} while (j <= 10);
			j=1;
			i++;
		} while (i <= 10);
	}

}
