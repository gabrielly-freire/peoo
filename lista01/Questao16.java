import java.util.Scanner;

/*Francisca Gabrielly Lopes Freire-21/01/2021
O programa calculará o dinheiro gasto por um fumante. A partir dos dados: o número de anos
que ele fuma; o nº de cigarros fumados por dia e o preço de uma carteira com 20 cigarros.*/

public class Questao16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o número de anos que você fuma: ");
        int anos = leia.nextInt() * 365;
        System.out.println("Digite o número de cigarros diário: ");
        int diario = leia.nextInt();
        System.out.println("O valor da carteira de cigarro: ");
        double carteira = leia.nextDouble() / 20;
        
        double dinheiro = anos * diario * carteira;
        System.out.println("Valor gasto por um fumante: " + dinheiro);

    }
}