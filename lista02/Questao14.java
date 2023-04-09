import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-20/01/2021
O programa mostrará correspondente o campus de acordo com o código
*/

public class Questao14 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Código  Campus");
		System.out.println("SC      IFRN/Santa Cruz");
		System.out.println("NC      IFRN/Nova Cruz");
		System.out.println("CNAT    IFRN/Natal Central");
		System.out.println("CANG    IFRN/Canguaretama");
		System.out.println("JC      IFRN/João Câmara");

		System.out.println("Digite um código: ");
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
			System.out.println("IFRN/João Câmara");
			break;
		default:
			System.out.println("Campus Inexistente");
			break;
		}
	}
}
