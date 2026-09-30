import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um senha para cadastrar ");
        String senha = scanner.nextLine();
        Boolean tem_Tamanho_Minimo = senha.length() >= 8;
        Boolean tem_Maiuscula = false;
        Boolean tem_Numero = false;

        for (int i = 0; i< senha.length(); i++){
            char c = senha.charAt(i);

            if(Character.isUpperCase(c)){
                tem_Maiuscula = true;
            }

            if (Character.isDigit(c)) {   
                tem_Numero = true;
            }
        }

        if (tem_Tamanho_Minimo && tem_Tamanho_Minimo && tem_Maiuscula && tem_Numero) {
            System.out.println("senha forte e válidada!");    
        } else {
            System.out.println("Senha invalidada!"); 
            System.out.println("A senha precisa ter  8 caracteres, 1 letra maiúscula e 1 número");
            System.out.println(" tente novamente");
        }

        scanner.close();
    }
}