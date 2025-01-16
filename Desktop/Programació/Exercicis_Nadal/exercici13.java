package Exercicis_Nadal;

import java.util.Scanner;

/**
 * Aquest exercici demana a l'usuari les dimensions (amplada i altura) 
 * d'un rectangle. Després, calcula i mostra l'àrea i el perímetre 
 * del rectangle. Serveix per practicar com llegir dades de l'usuari 
 * i fer càlculs matemàtics bàsics.
 */

public class exercici13 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);

        double amplada = 0;
        double altura = 0;

        System.out.println("Introdueix l'amplada");
        amplada = in.nextDouble();

        System.out.println("Introdueix l'altura");
        altura = in.nextDouble();

        System.out.println("L'area és "+amplada+" * "+altura+" = "+(amplada*altura));

        System.out.println("El perimetre és 2 * ("+amplada+" + "+altura+") = "+(2*(amplada+altura))) ;
    }   
}
