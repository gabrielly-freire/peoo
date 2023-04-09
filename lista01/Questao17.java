import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa calculará a área e o volume de um cilindro.
Formulas:Área da superficie = 2πr^2 + 2πrh e Volume = πr^2*h */

public class Questao17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a altura do cilindro: ");
        double altura = leia.nextDouble();
        System.out.println("Digite o raio do cilindro: ");
        double raio = leia.nextDouble();
        
        final double PI = 3.14159;
        double areaDaSuperficie = (2 * PI * Math.pow(raio, 2)) + (2 * PI * raio * altura);
        double volume = PI * Math.pow(raio, 2) * altura;
        
        System.out.println("A área da superficie do cilindro: " + areaDaSuperficie);
        System.out.println("O volume do cilindro: " + volume);
    }
}