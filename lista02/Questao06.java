import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-19/01/2021
O programa calcular� a m�dia de um aluno e informar� sua situa��o
*/

public class Questao06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a nota da prova 1:");
		double nota1 = leia.nextDouble();
		System.out.println("Digite a nota da prova 2:");
		double nota2 = leia.nextDouble();
		System.out.println("Digite a nota da prova 3:");
		double nota3 = leia.nextDouble();
		System.out.println("Digite seu n�mero de faltas: ");
		int faltas = leia.nextInt();

		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("Sua m�dia �: " + media);

		if (media >= 7 && faltas < 7) {
			System.out.println("Aprovado!!!");
		}
		if (media >= 3 && media < 7 && faltas < 7) {
			System.out.println("Recupera��o");
			System.out.println("Digite a nota da prova final:");

			double nota4 = leia.nextDouble();
			double mediaFinal = (media + nota4) / 2;
			System.out.println("Sua m�dia final: " + mediaFinal);

			if (mediaFinal >= 5) {
				System.out.println("Voc� foi aprovado!!!");
			} else {
				System.out.println("Infelizmente voc� reprovou");
			}
		}
		if (media < 3 || faltas >= 7) {
			System.out.println("Infelizmente voc� reprovou");
		}

	}

}
