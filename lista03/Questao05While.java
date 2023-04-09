import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 25/01/2021
O programa mostrará a média das idades de uma turma
*/
public class Questao05While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos que há na turma:");
		int a = leia.nextInt();
		int i = 1;
		int soma = 0;
		
		while (i <= a) {
			System.out.println("Digite a idade do aluno " + i + ":");
			int idade = leia.nextInt();
			soma =soma+ idade;
			i++;
		}
		
		double media = soma / a;
		System.out.println("A média da idade dos aluno é: " + media);
	}

}
