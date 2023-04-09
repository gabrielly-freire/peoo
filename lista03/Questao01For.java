/*Francisca Gabrielly Lopes Freire - 25/01/2021
O programa calculará a soma entre os primeiros 500 números naturais.
*/
public class Questao01For {

	public static void main(String[] args) {

		int soma = 0;

		for (int i = 0; i <= 500; i++) {
			soma = soma + i;
		}
		System.out.println("Soma dos numeros de todos os numeros de 1 e a 500" + soma);
	}

}
