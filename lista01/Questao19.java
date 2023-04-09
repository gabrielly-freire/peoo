import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa irá converter um valor em jardas fornecido pelo usuário para metros.
Sabendo que 1 jarda equivale a 0,91 metros.*/

public class Questao19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o valor da jarda: ");
        double jarda = leia.nextDouble();
        
        double metros = jarda * 0.91;
        
        System.out.println("Valor da jarda em metros: " + metros);
    }
}