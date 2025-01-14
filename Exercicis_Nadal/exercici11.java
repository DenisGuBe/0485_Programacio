package Exercicis_Nadal;

import java.util.Scanner;

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
