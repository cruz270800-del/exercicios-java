public class Main {
    public static void main (String [] args){
        int num = 5; //numero que vamos ver a tabuada
        System.out.println("--- tabuada do" + num + "----" );
        //loop for possui 3 partes
        //inicialização : int i = 1 (começa no 1)
        //condição i <= 10 (repete ate o 10)
        //incremento: i++ (aumenta 1 a cada volta)
        for (int i =1; i<=10; i++) {
            int resultado = num* i;
            System.out.println(num + " x " + i + "+ " + resultado);
        }
    }
}