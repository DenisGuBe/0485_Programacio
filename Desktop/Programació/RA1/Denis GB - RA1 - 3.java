import java.util.Scanner;

/**
 * Aquest programa calcula el canvi que s'ha de tornar després de comprar una poma.
 * 1. Demana a l'usuari el preu de la poma.
 * 2. Pregunta quants diners ha pagat l'usuari.
 * 3. Calcula la diferència entre els diners pagats i el preu, i mostra el canvi.
 * Aquest programa serveix per practicar càlculs senzills i lectura d'entrada amb `Scanner`.
 */

public class MyClass {
    
    public static void main(String args[]) {
        int preu = 0;
        int diners = 0;
        int canvi = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Quant val la poma?");
        preu = in.nextInt();

        System.out.println("Amb quants diners has pagat?");
        preu = in.nextInt();

        canvi = diners - preu;
        System.out.println("El canvi serà de" + canvi);
    }

}
