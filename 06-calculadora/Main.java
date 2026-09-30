import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("pt", "Br"));

        System.out.println("Prazer, calculadora.");
        System.out.println("Escolha: 1-Soma | 2-Subtração | 3-Multiplicação | 4-Divisão");
        int opcao = scanner.nextInt();

        System.out.print("digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("opção errada ");
                break;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}