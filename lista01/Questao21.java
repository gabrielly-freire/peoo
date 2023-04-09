import static java.lang.Math.toRadians;
import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa determinar� o seno, o cosseno e a tangente de um �ngulo fornecido pelo usu�rio.*/

public class Questao21 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um �ngulo: ");
		double a = leia.nextDouble();
		
		a = toRadians(a);
		double sin = Math.sin(a);
		double cos = Math.cos(a);
		double tan = Math.tan(a);
		
		System.out.println("O valor do seno do �ngulo digitado: " + sin);
		System.out.println("O valor do cosseno do �ngulo digitado:" + cos);
		System.out.println("O valor da tangente do �ngulo digitado: " + tan);
	}
}