import java.util.Scanner;

public class activitatWhile{

    public static void main(String[] args){
        
        String nom;
        int numero = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Posa el teu nom");
        nom = in.nextLine();

        while (numero<5) {
            System.out.println("Numero " + numero + " - " + nom);
            numero ++;
        }
    }
}