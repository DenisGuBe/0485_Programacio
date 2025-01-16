package deuresnadal;

import java.util.Scanner;

/**
 * En aquest exercici el programa demana a l'usuari tres números,
 * calcula la mitjana d'aquests tres números i després mostra el resultat.
 * Serveix per practicar com demanar dades a l'usuari i fer càlculs senzills.
 */

public class exercici12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double mitjana = 0;

        System.out.println("Introdueix el primer numero");
        num1 = in.nextDouble();
        System.out.println("Introdueix el segon numero");
        num2 = in.nextDouble();
        System.out.println("Introdueix el tercer numero");
        num3 = in.nextDouble();

        mitjana = (num1+num2+num3)/3;
        System.out.println("Resultat: " + mitjana);
    }
}
