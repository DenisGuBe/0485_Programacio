import java.util.Scanner;

public class activitatWhile3 {

    public static void main (String[] args){

        int numero = 0;
        Scanner in = new Scanner(System.in);

        while (numero<50){
            System.out.println("Numero: " + numero);
            if(numero %10 ==2){
                System.out.println("patito");
            }
            if(numero %10 ==3){
                System.out.println("pepito");
            }
            
            numero++;
        }
    }
}
