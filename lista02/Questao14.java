import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-20/01/2021
O programa mostrar� correspondente o campus de acordo com o c�digo
*/

public class Questao14 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("C�digo  Campus");
		System.out.println("SC      IFRN/Santa Cruz");
		System.out.println("NC      IFRN/Nova Cruz");
		System.out.println("CNAT    IFRN/Natal Central");
		System.out.println("CANG    IFRN/Canguaretama");
		System.out.println("JC      IFRN/Jo�o C�mara");

		System.out.println("Digite um c�digo: ");
		String codigo = leia.next();
		switch (codigo) {
		case "SC":
			System.out.println("IFRN/Santa Cruz");
			break;
		case "NC":
			System.out.println("IFRN/Nova Cruz");
			break;
		case "CNAT":
			System.out.println("IFRN/Natal Central");
			break;
		case "CANG":
			System.out.println("IFRN/Canguaretama");
			break;
		case "JC":
			System.out.println("IFRN/Jo�o C�mara");
			break;
		default:
			System.out.println("Campus Inexistente");
			break;
		}
	}
}
