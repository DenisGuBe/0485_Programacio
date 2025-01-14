import java.util.Scanner;
public class activitatWhile2 {

    public static void main(String[] args){

        int numero=0;
        int augment=0;
        Scanner in = new Scanner(System.in);

        System.out.println("Diguis un numero");
        numero = in.nextInt();

        while(augment<3){
            numero = numero * numero;
            System.out.println("Resultat" + numero);
            augment++;
        }
    }   
}
