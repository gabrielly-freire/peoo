import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa irá converter à idade de uma pessoa em dias para anos, meses e dias.
*/

public class Questao23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite sua idade em dias: ");
        int idade = leia.nextInt();
        
        int ano = idade / 365;
        int anoR = idade % 365;
        int mes = anoR / 30;
        int mesR = anoR % 30;
        int dia = mesR;
        
        System.out.println(ano + " ano " + mes + " meses " + dia + " dias");
    }
}