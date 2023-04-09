import java.util.Scanner;
/*Francisca Gabrielly Lopes Freire - 26/01/2021
O programa calculará a tabuada de algum número digitado 
*/
public class Questao08While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = leia.nextInt();
		int i=1;
		
		while(i<=10) {
			System.out.println(n + " x " + " " + i + " = " + n*i);
		i++;
		}
	}

}
