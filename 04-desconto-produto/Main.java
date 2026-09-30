import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner (System.in);
        scanner.useLocale (new Locale ("pt", "Br"));
        System.out.println("digite o produto que você quer: ");
        String nome = scanner.nextLine();
        System.out.println("digite o valor do produto");
        double preco = scanner.nextDouble();

        if (preco >= 100) {
            double preco_com_Desconto = preco * 0.90; //calcula 10% desc 
            System.out.println("Produto: " + nome);
            System.out.println("Desconto aplicado! valor final: R$ " + preco_com_Desconto);
        } else {
            System.out.println("Produto: " + nome);
            System.out.println("Sem desconto. Valor final: R$" + preco);
            scanner.close();
        }
    }
}