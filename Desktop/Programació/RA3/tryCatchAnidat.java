
import java.util.Scanner;

public class tryCatchAnidat{

    public static void main (String args[]){

        //Declaració de Variables
        Scanner in=new Scanner(System.in); //Objecte per fer lectura de teclat
        String producte; //Aquesta variable guardarà el nom del producte
        int quantitat; //Aquesta variable tindrà el la quantitat de productes comprats
        int cost; //Aquesta variable tindrà els valor que s'entrarà per teclat i que compararem
        iny total; // Aquesta variable tindrà valor del total de la compra
        boolean error = true;
        
        //Inici d'ordres
        while(error){
        try{
        System.out.println("Quin és el producte que vens?"); //Mostrem per pantalla el missatge
        producte = in.nextLine(); //La pròxima linia de text escrita per teclar es guardarà a la variable
        
        System.out.println("Quina quantitat has venut?"); //Mostrem per pantalla el missatge
        quantitat = in.nextInt(); //el pròxim integer que s'encrigui per teclat es guardarà a la variable
        
        System.out.println("Quin és el preu del producte?"); //Mostrem per pantalla el missatge
        cost = in.nextInt(); //el pròxim integer que s'encrigui per teclat es guardarà a la variable
        //Calculem el total de la compra
        total = quantitat*cost;
        error=false;
        }
        catch(Exception amin){
          System.out.println("Excepcio-->"+amin);
          in.nextLine();

        }
        }

        
        
        //Comprovem que la quantiat és menor de 10
        if (quantitat > 10){ 
            System.out.println("Compra bàsica"); //Mostrem per pantalla el missatge
        }
        else if(quantitat>50){ //Comprovem que és menor de 50
        	if (quantitat==33) { //Dins del bloc (menor de 50) comprovem si és el 33 o no
                System.out.println("El nanooooooo!!!"); //Mostrem per pantalla el missatge
        	}
        	else {
                System.out.println("Compra Standard"); //Mostrem per pantalla el missatge        		
        	}
        	total = total * 0.95f;  //Apliquem un 5% de descompte especificant que el 0.95 és un número float
        } //acabem bloc de menys de 50
        else { 
        	System.out.println("Compra Amplia"); //Mostrem per pantalla el missatge        		
        	total = total * 0.90f; //Apliquem un 10% de descompte especificant que el 0.90 és un número float
        }
        
        //Comprovem si la compra total és major de 1000
        if (total>1000) {
          System.out.println("Gràcies per la compra. Disposa d'un regal sorpresa"); //Mostrem per pantalla el missatge
        }
        else { //si no era major de mil, s'executarà aquest codi
          System.out.println("Gràcies per la compra."); //Mostrem per pantalla el missatge
        }
        
        in.close();//recomanat tancar els objectes d'entrada d'informació
    }
}