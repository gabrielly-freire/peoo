import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int []h= new int[90];
		int cont1= 0;
		int cont2= 0;

		for (int i = 0; i < h.length; i++) {
			System.out.println("Digite quantas horas você acessou a internet mês passado");
			h[i]=leia.nextInt();
			if(h[i]>310) {
				System.out.println("Valor invalido");
				System.out.println("Digite um numero entre 0 e 310");
				i--;
			}
		}
		for (int i = 0; i < h.length; i++) {
			if(h[i]>100) {
				cont1++;
			}else if(h[i]<10) {
				cont2++;
			}
		}
		System.out.println("Alunos que acessam mais de 100 horas: "+cont1);
		System.out.println("Alunos que acessam menos de 10 horas: "+cont2);

	}
}
