import java.util.Scanner;

public class String3 {
    public static void main (String args[]){

        Scanner in = new Scanner (System.in);

        String nom;

        System.out.println("Introdueix el teu nom");
        nom = in.nextLine();

        for(int i=nom.length() - 1 ;i>=0;i--){
            System.out.println(nom.charAt(i));
        }

    }
    
}
