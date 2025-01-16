package repas;

import java.util.Scanner;

public class enunciat1 {
    public static void main (String args[]){
        enunciat1 prog = new enunciat1();
        
        /*VARIABLES
        - Intents
        - Char-lecturalletra
        - Char [][]
            - Lletres paraula
            - Encert o no
        Char [] - intents erronis
        Boolean - paraula corrcta?*/

        int intents = 0; //intents fins arribar 9
        char lletra = ' '; //lletra usada en cada intent
        char [][] paraula; // paraula a encertar
        char [] lletres; // lletres no encertades
        boolean seguir = true; //per poder seguir el while

        paraula = prog.demanaParaula();

        while(seguir){
            prog.imprimirEstat(paraula, lletres, intents);
            prog.
        }

    }

    //METODES

    //demanarParaula
    public char[][] demanaParaula(){
        //Aquest metode demana paraula al usuari i la retornarà
    }

    /*
     * demanarParaula
     * El metode demanarà la paraula que usarem pel programa i iniciarem l'array que retornarem
     * @return array inicialitzar sense encerts
     */

     //imprimirEstat
    public void imprimirEstat(char[][] paraImpr, char[] fallos, int provat){
        //Imprimeix per pantalla guionets o lletres, els intents i les lletres fallades
    }

    /*
     * imprimirEstat
     * @param paraImpr - Array bidimensional de encerts i paraula
     * @param fallos - Array char de les lletres intentades
     * @param provat - int amb els intents fets.
     */

    //demanarLletra

    //comprovarLletraParaula

    //encertError


}
