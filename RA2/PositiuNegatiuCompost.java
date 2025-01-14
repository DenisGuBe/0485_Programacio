import java.util.Scanner;

public class PositiuNegatiuCompost{

    public static void main (String args[]){

        // //Declaració de Variables
        // Scanner teclat=new Scanner(System.in); //Objecte per fer lectura de teclat
        // int numero; //Aquesta variable tindrà el número que s'entrarà per teclat i que compararem

        // //Inici d'ordres
        // System.out.println("Si us plau, escriu un número?"); //Mostrem per pantalla el missatge
        // numero= teclat.nextInt(); //el pròxim integer que s'encrigui per teclar es guardarà a la variable
        String nom2 = new String ("Hola");
        String nom = new String ("Hola");

        if (numero>0){ //comprovem si el número és MAJOR de 0
            System.out.println("El número és positiu"); //Mostrem per pantalla el missatge
        }
        else if (numero<0){ //si no ho és, comprovem si és MENOR de 0
            System.out.println("El número és negatiu"); //Mostrem per pantalla el missatge
        }
        else{ //si no és cap de les anteriors, vol dir que és 0
            System.out.println("El número és 0"); //Mostrem per pantalla el missatge
        }
        
        teclat.close();//recomanat tancar els objectes d'entrada d'informació
    }
}