import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa calcular� a �rea de um tri�ngulo. Formula: (base*altura)/2.
 */
public class Questao14 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a base do tri�ngulo: ");
		double base = leia.nextDouble();
		System.out.println("Digite a altura do tri�ngulo: ");
		double altura = leia.nextDouble();

		double area = (base * altura) / 2;
		
		System.out.println("O valor da �rea: " + area);
	}
}
