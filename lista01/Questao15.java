import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa irá converter um número em segundos para dias, horas, minutos e segundos.*/

public class Questao15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite os segundos: ");
        int seg = leia.nextInt();
        
        int dia = seg / 86400;
        int diaR = seg % 86400;
        int hora = diaR / 3600;
        int horaR = diaR % 3600;
        int minuto = horaR / 60;
        int minutoR = horaR % 60;
        int segundos = minutoR;
        
        System.out.println(dia + " dias " + hora + " horas " + minuto + " minutos " + segundos + " segundos");

    }
}