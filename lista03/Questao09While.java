/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa calcular� a m�dia dos n�meros pares entre 12 e 873 
*/
public class Questao09While {

	public static void main(String[] args) {
		
		int i = 12;
		int soma = 0;
		double contador = 0;
		
		while (i <= 873) {
			if (i % 2 == 0) {
				soma = soma + i;
				contador = contador + 1;
			}
			i++;
		}
		
		double media = soma / contador;
		System.out.println("A m�dia entre os n�mero pares em 12 e 873 �: " + media);

	}

}
