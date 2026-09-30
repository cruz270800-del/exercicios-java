import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if(idade < 16) {
            System.out.println("não leitor");
        } else if ((idade>= 16 && idade <=17) || idade>= 70) {
            System.out.println("eleitor facultativo");
        } else {
            System.out.println("eleitor obrigatorio.");
        }
        scanner.close();
    }
}