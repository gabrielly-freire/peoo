import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] n = new int[30];
		double media = 0;
		double soma = 0;
		int cont = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.println("Digite a nota do aluno " + (i + 1) + ":");
			n[i] = leia.nextInt();

			soma += n[i];
			media = soma / n.length;
		}
		
		System.out.println("Média das notas da turma: " + media);
		
		for (int i = 0; i < n.length; i++) {
			if (media < n[i]) {
				System.out.println("Nota acima da média da turma: " + n[i]);
				cont++;
			}
		}
		
		System.out.println("Quantidade de notas acima da média " + cont);
		
	}

}
