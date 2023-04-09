import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-18/01/2021
O programa calculará a nota final de um candidato de um concurso público.
De acordo com a formula: NF = 0,4 x PE + 0,4 x PD + 0,2 x PT.
 */

public class Questao07 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua nota na prova escrita: ");
		double pE = leia.nextDouble();
		System.out.println("Digite sua nota na prova de desempenho: ");
		double pD = leia.nextDouble();
		System.out.println("Digite sua nota na prova prova de títulos: ");
		double pT = leia.nextDouble();

		double notaFinal = (0.4 * pE) + (0.4 * pD) + (0.2 * pT);

		System.out.println("Sua nota final é " + notaFinal);
	}
}
