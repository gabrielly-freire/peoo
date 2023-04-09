/*Francisca Gabrielly Lopes Freire - 25/01/2021
O programa calculará a soma entre os primeiros 500 números naturais.
*/
public class Questao01DoWhile {
	public static void main(String[] args) {

		int i = 0;
		int soma = 0;

		do {
			soma = soma + i;
			i++;
		} while (i <= 500);
		System.out.println("Soma dos numeros de todos os numeros de 1 e a 500" + soma);
	}
}
