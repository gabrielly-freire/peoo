/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa calcular� a m�dia dos n�meros pares entre 12 e 873 
*/
public class Questao09DoWhile {

	public static void main(String[] args) {
		int i = 12;
		int soma = 0;
		double contador = 0;
		do {
			if (i % 2 == 0) {
				soma = soma + i;
				contador = contador + 1;
			}
			i++;
		} while (i <= 873);
		
		double media = soma / contador;
		System.out.println("A m�dia entre os n�mero pares em 12 e 873 �: " + media);

	}

}
