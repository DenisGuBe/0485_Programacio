import java.util.Scanner;

public class String2 {
    public static void main (String args[]){

        Scanner in = new Scanner(System.in);

        String nom;
        char lletra;

        System.out.println("Introdueix el teu nom");
        nom = in.nextLine();

        System.out.println("La llarga del teu nom es: "+nom.length());

        for(int i=0; i<nom.length();i++){
            lletra = nom.charAt(i);
        switch(lletra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(lletra);
            break;
            default:;
            break;
        }
    }
    }


    }
    

