/*Francisca Gabrielly Lopes Freire - 25/01/2021
O programa mostrará os multiplos de 7 menores que 2000
*/
public class Questao02DoWhile {

	public static void main(String[] args) {
		int i =0;
		do {
			if(i%7==0) {
				System.out.println("É multiplo de 7: " + i);
			}
			i++;
		}while(i<2000);

	}

}
