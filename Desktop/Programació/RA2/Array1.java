import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int[] num;

        num = new int[5];

        System.out.println("Introdueix 5 numeros");

        for(int i=0; i<5; i++){
            System.out.println("Escriu el número "+i);
            num[i] = in.nextInt();   
        }

        for(int i=0; i<5; i++){
            System.out.println("El numero que has posat son " + num[i]);
        }


    }
    
}
