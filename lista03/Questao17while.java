/*Francisca Gabrielly Lopes Freire - 27/01/2021
O programa mostrará a tabuada do 1 ao 10
*/
public class Questao17while {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		while (i <= 10) {
			while (j <= 10) {
				System.out.println(i + " x " + j + " = " + i * j);
				j++;
			}
			j=1;
			i++;
		}

	}

}
