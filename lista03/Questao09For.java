/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa calcular� a m�dia dos n�meros pares entre 12 e 873 
*/
public class Questao09For {

	public static void main(String[] args) {
		
		double soma = 0;
		int contador = 0;
		
		for (int i = 12; i <= 873; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
				contador = contador + 1;
			}
		}
		
		double media = soma / contador;
		System.out.println("A m�dia dos n�mero pares entre 12 e 873 �: " + media);
	}

}
