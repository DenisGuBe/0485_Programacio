package Exercicis_Nadal;

import java.util.Scanner;

/**
 * Aquest exercici demana a l'usuari el radi d'un cercle. 
 * Amb aquesta informació, el programa calcula i mostra:
 * - El perímetre del cercle (utilitzant la fórmula 2 * π * radi).
 * - L'àrea del cercle (utilitzant la fórmula π * radi^2).
 * Serveix per practicar càlculs amb fórmules matemàtiques i 
 * treballar amb variables de tipus `double`.
 */

public class exercici11 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);

        double radi = 0;
        double perimetre = 0;
        double area = 0;

        System.out.println("Diguis el radi del cercle");
        radi = in.nextDouble();

        perimetre = 2*3.14*radi;
        System.out.println("El perimetre del cercle és" + perimetre);

        area = 3.14*radi*radi;
        System.out.println("L'area del cercle és" + area);
    }
}
