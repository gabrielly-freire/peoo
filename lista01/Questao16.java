import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa calcular� o dinheiro gasto por um fumante. A partir dos dados: o n�mero de anos
que ele fuma; o n� de cigarros fumados por dia e o pre�o de uma carteira com 20 cigarros.*/

public class Questao16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o n�mero de anos que voc� fuma: ");
        int anos = leia.nextInt() * 365;
        System.out.println("Digite o n�mero de cigarros di�rio: ");
        int diario = leia.nextInt();
        System.out.println("O valor da carteira de cigarro: ");
        double carteira = leia.nextDouble() / 20;
        
        double dinheiro = anos * diario * carteira;
        System.out.println("Valor gasto por um fumante: " + dinheiro);

    }
}