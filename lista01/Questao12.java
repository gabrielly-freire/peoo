import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa converterá euros para reais. Levando em consideração 
que 1,00 Euro equivale a R$ 4,32.*/

public class Questao12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o valor em Euros: ");
        double euro = leia.nextDouble();
        
        double euroReais = euro * 4.32;
        System.out.println("Valor em Reais: " + euroReais);

    }
}