import java.util.Scanner;

public class String1{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);

        String nom;

        System.out.println("Introdueix el teu nom");
        nom = in.nextLine();

        System.out.println("La llargada del teu nom és:"+nom.length());

        for(int i=0;i<=nom.length();i++){
            System.out.println(nom.charAt(i));
        }

        in.close();

    }
}