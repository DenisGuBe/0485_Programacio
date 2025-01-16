package Preparacio;

import java.util.Scanner;

/**
 * Aquest programa simula la compra d'un producte:
 * 1. Demana a l'usuari el nom del producte, la quantitat comprada i el preu per unitat.
 * 2. Calcula el cost total de la compra.
 * 3. Aplica descomptes segons la quantitat:
 *    - Sense descompte per menys de 10 unitats.
 *    - 5% de descompte per compres entre 10 i 50 unitats (amb un missatge especial si la quantitat és 33).
 *    - 10% de descompte per més de 50 unitats.
 * 4. Mostra el cost final i, si supera els 1000 €, ofereix un "regal sorpresa".
 * Aquest exercici serveix per practicar condicions anidades (`if-else`), càlculs amb variables i constants, i interacció amb l'usuari.
 */

public class anidat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nom;
        int quantitat=0;
        double preu=0;
        double total=0;
        final double descompte5=0.05;
        final double descompte10=0.1;

        System.out.println("Introdueix el producte: ");
        nom = in.nextLine();

        System.out.println("Introdueix la quantitat: ");
        quantitat = in.nextInt();

        System.out.println("Introdueix el preu per unitat: ");
        preu = in.nextDouble();

        total = quantitat*preu;

        if (quantitat<10){
            System.out.println("Compra basica");
        } else if (quantitat<50){
            System.out.println("Compra standard");
            if (quantitat==33){
            System.out.println("El nanooo!");
            }
            total = total-(total*descompte5);
        }
        else if (quantitat > 50){
            System.out.println("Compra amplia");
            total =total-(total*descompte10);
        }

        
        System.out.println("La compra total despres del descompte es de " +total);
        
        if (total>1000){
            System.out.println("Gràcies per la compra. Disposa d'un regal sorpresa");
        }else {
            System.out.println("Gracies per la compra");
        }
    }
    
}
