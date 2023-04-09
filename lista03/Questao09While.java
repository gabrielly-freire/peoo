/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa calculará a média dos números pares entre 12 e 873 
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
		System.out.println("A média entre os número pares em 12 e 873 é: " + media);

	}

}
