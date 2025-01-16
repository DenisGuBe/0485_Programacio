package Exercicis_Nadal;

/**
 * En aquest exercici el programa intercanvia el valor de dues variables.
 * Primer mostra els valors originals de les variables, després utilitza 
 * una variable "comodí" per intercanviar-ne els valors, i finalment 
 * torna a mostrar els nous valors. És útil per entendre com funciona 
 * l’intercanvi de dades entre variables.
 */

public class exercici15 {
    public static void main (String args[]){

        int variable1 = 2;
        int variable2 = 5;
        int comodin = 0;

        System.out.println("La variable 1 és: "+variable1+" la variable 2 és: "+variable2);

        comodin=variable1;
        variable1=variable2;
        variable2=comodin;

        System.out.println("La variable 1 és: "+variable1+" la variable 2 és: "+variable2);
    }
}
