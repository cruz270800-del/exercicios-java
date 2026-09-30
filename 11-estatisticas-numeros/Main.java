import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int quantidade = 0;
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite alguns números inteiros (Digite 0 pra encerrar): ");
        while (true){
            num = scanner.nextInt();
            if (num==0){
                break;
            }
            quantidade++;
            soma += num;
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        if (quantidade > 0 ) {
            double media = (double) soma / quantidade;
            System.out.println("\n ----- Resultados ---" );
            System.out.println("quantidade de numero: " + quantidade);
            System.out.println(" Maior número " + maior );
            System.out.println(" Menor numero " + menor );
            System.out.printf(" Média: %.2f\n", + media);
        } else { 
            System.out.println("Nenhum numero valido foi digitado");
        }
        scanner.close();
    }
}