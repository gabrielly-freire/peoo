import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-12/03/2020
*O programa mostrar� o dividendo, divisor, quociente e resto inteiro
de dois n�meros fornecido pelo usu�rio.
 */

public class Questao05 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		double numero1 = leia.nextDouble();
		System.out.println("Digite mais um n�mero: ");
		double numero2 = leia.nextDouble();

		double quociente = numero1 / numero2;
		double resto = numero1 % numero2;

		System.out.println("Dividendo: " + numero1);
		System.out.println("Divisor: " + numero2);
		System.out.println("Quociente: " + quociente);
		System.out.println("resto: " + resto);

	}
}
