import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int resultat[];
        resultat = new int[5];

        for(int i=0; i<5; i++){
            resultat[i] = (int)(Math.random()*12)+1;
            System.out.println("El resultat "+i+" és: "+resultat[i]);
        }

        System.out.println("La suma del 2n lloc i 4t lloc és: " + (resultat[1]+resultat[3]));
    }
    
}
