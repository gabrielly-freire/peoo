import java.util.Scanner;

/*Nome: Francisca Gabrielly Lopes Freire-19/01/2021
O programa mostrará a categoria correspondente ao atleta de acorco com a idade
*/

public class Questao13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = leia.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();

		if (idade >= 5 && idade <= 10) {
			System.out.println("Categoria: Infantil");
		}
		if (idade >= 11 && idade <= 15) {
			System.out.println("Categoria: Juvenil");
		}
		if (idade >= 16 && idade <= 20) {
			System.out.println("Categoria: Júnior");
		}
		if (idade >= 21 && idade <= 25) {
			System.out.println("Categoria: Profissional");
		}

	}

}
