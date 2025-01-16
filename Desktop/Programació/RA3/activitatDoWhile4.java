import java.util.Scanner;

/**
 * Exercici que demana a l'usuari que endevini un número amb un màxim d'intents.
 */

public class activitatDoWhile4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int intent = 0;
        final int CONSTANT = 5;
        int numero =0;
        int intents = 0;

        System.out.println("Introdueix numero d'intents.");
        intents = in.nextInt();

        do { 
            System.out.println("Encerta el número");
            numero = in.nextInt();

            if (numero == CONSTANT){
                System.out.println("Has endevinat el numero");
                break;
            } else if(CONSTANT>numero){
                System.out.println("El numero ha de ser major");
            } else if(CONSTANT>numero){
                System.out.println("El numero ha de ser menor");
            }
            intent++;
        
        } while (intent < intents);
        
    }
    
}
