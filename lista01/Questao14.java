import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa calculará a área de um triângulo. Formula: (base*altura)/2.
 */
public class Questao14 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a base do triângulo: ");
		double base = leia.nextDouble();
		System.out.println("Digite a altura do triângulo: ");
		double altura = leia.nextDouble();

		double area = (base * altura) / 2;
		
		System.out.println("O valor da área: " + area);
	}
}
