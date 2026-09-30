public class Main {
    public static void main(String[]args){
        double nota_final = 6.5;
        System.out.println("nota do aulo: " + nota_final);
        if (nota_final>= 7.0) {
            System.out.println("Status: aprovado!!");
        }else if (nota_final>=5.0) {
            System.out.println("status: Recuperação");
        } else {
            System.out.println("Status: reprovado!");
        }
    } 
}