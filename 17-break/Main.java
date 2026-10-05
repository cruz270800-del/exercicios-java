// aula  de aprender break e continue 
// break serve pra destruir o laço imediatamente.
//////////////////////////////////////
//exemplo:
public class Main {
    public static void main (String [] args){
    for (int i = 1; i <= 5; i++){
        if(i == 3){
            System.out.println("Encontrei o 3! botao break acionado");
            break;
        } 
        System.out.println("procurando... número " + i);
    }
}
}