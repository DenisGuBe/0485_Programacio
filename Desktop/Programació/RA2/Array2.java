import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int num [];
        num = new int[12];

        System.out.println("Posa un valor");
        num[0]=in.nextInt();

        System.out.println("Has introduit el valor: " +num[0]);

        for(int i=1; i<12;i++){
            num[i] = num[i-1]*2;
            System.out.println("El valor de la posició: " +i+" és: "+ num[i]);
            
             
        }
    }
    
}
