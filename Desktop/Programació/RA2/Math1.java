import java.util.Scanner;

public class Math1 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);

        double dau1 = 0;
        double dau2 = 0;
        double suma = 0;

        dau1 = Math.random();
        dau1 = dau1*6 + 1;

        dau2= Math.random();
        dau2 = dau2*6 + 1;

        System.out.println("El resultat dels dos daus és: " + (int)dau1 +" i " + (int)dau2);

        suma = dau1+dau2;
        System.out.println("La suma dels dos és: " + (int)suma );

    }
    
}
