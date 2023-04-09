import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa calculará o valor das parcelas e o valor da multa de 2% sobre uma parcela, caso o cliente
esqueça-se de pagar a mesma. Com base nas informações fornecidas pelo usuário o valor do produto e a 
quantidade de parcelas.*/

public class Questao20 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor do produto: ");
		double valor = leia.nextDouble();
		System.out.println("Digite a quantidade de parcelas: ");
		double parcelas = leia.nextDouble();

		double valorParcela = valor / parcelas;
		double multa = (2 / 100.0) * valorParcela;

		System.out.println("O valor de cada parcela: " + valorParcela);
		System.out.println("O valor da multa por parcela: " + multa);
	}
}