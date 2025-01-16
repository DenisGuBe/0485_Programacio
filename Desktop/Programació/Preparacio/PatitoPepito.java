/**
3-Fem un programa en java on mostri per pantalla un llistat de números del 1 al 50. 

Cada cop que el número tingui un 2 caldrà adjuntar "patito", quan tingui un 3 caldrà adjuntar, "pepito". Exemple:

12 - patito
30 - pepito
23 - patito pepito
 */
import java.util.Scanner;

public class PatitoPepito{

    public static void main (String args[]){

        //Declaració de Variables
        Scanner teclat=new Scanner(System.in); //Objecte per fer lectura de teclat
        byte cont=0; //comptador que comularà les vegades que es fa la iteració "while"
        
        //Inici d'ordres
        
        while (cont<50) { //Fins a 50 cops
        	cont++; // incrementem el comptador. Al començar per 0, volem que el compte sigui de 1 a 50. Per això ho fem abans de les ordres
        	System.out.print(cont);
        	//Mirem els decimals. Hem de dividir entre 10 per poder tenir el decimal
        	if ((cont/10)==2) {
            	System.out.print(" Patito"); //Mostrem per pantalla el missatge
        	}
        	else if ((cont/10)==3){
        		System.out.print(" Pepito"); //Mostrem per pantalla el missatge
        	}
        	//Ara mirem les unitats fent servir el "modular" %
        	if ((cont%10)==2) {
            	System.out.print(" Patito"); //Mostrem per pantalla el missatge
        	}
        	else if ((cont%10)==3){
        		System.out.print(" Pepito"); //Mostrem per pantalla el missatge
        	}        	
        	System.out.println(); //Imprimim línia per fer el salt de línia
        }
        
        teclat.close();
    }
}