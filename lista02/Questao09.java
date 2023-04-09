import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-19/01/2021
O programa calculará o valor de uma multa de acordo com o valor 
da velocidade ultrapassada do valor limite
*/

public class Questao09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor da velocidade limite");
		int limite = leia.nextInt();
		System.out.println("Digite o valor da sua velocidade: ");
		int velocidade = leia.nextInt();

		int ultrapassado = velocidade - limite;
		
		if (ultrapassado > 0) {
			if (ultrapassado >= 1 && ultrapassado <= 10) {
				System.out.println("Sua multa é igual a R$ 50,00");
			} else if (ultrapassado >= 11 && ultrapassado <= 30) {
				System.out.println("Sua multa é igual a R$ 100,00");
			} else {
				System.out.println("Sua multa é igual a R$ 200,00");
			}
		} else {
			System.out.println("Sem multa!");
		}
	}

}
