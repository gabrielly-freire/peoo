import java.util.Scanner;

/*Nome: Francisca Gabrielly Lopes Freire-19/01/2021
O programa mostrar� os dias da semana que corresponde aos n�meros
*/

public class Questao12 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = leia.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Ter�a-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("ERRO");
			break;
		}
	}
}
