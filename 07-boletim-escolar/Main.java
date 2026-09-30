import java.util.Scanner;
import java.util.Locale;

public class Main  {
    public static void main(String [] args) {
        Scanner scanner =  new Scanner(System.in);
        scanner.useLocale(new Locale("pt", "Br"));
        System.out.println("digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("você esta no seu boletim");
        System.out.print("digite sua primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.print("digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("digite sua terceira nota:");
        double nota3 = scanner.nextDouble();
        // agora temos duas notas - nota1 nota2 nota3
        // agora seguir a forma da media
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("aluno: " + nome);
        System.out.println("Média: " + media);
        if (media  >= 7) {
            System.out.println("você foi aprovado");
        } else if (media >= 6) {
            System.out.println("voce está de recuperação");
        } else {
            System.out.println("Situcação: reprovado");
        }
    }
}