import java.text.DecimalFormat;
import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire- 21/01/2021
O programa calculará a distância entre 4 pontos (2X e 2Y) fornecidos pelo usuário,
mostrando 4 casas decimais após a vírgula*/
public class Questao22 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de x1: ");
		double x1 = leia.nextDouble();
		System.out.println("Digite o valor de y1: ");
		double y1 = leia.nextDouble();
		System.out.println("Digite o valor de x2: ");
		double x2 = leia.nextDouble();
		System.out.println("Digite o valor de y2: ");
		double y2 = leia.nextDouble();
		
		double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		DecimalFormat decimal = new DecimalFormat("0.0000");
		
		System.out.println("O valor da distância dos pontos: " + decimal.format(distancia));
	}
}