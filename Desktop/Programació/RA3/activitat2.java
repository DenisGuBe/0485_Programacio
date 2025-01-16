import java.util.Scanner;

public class activitat2 {

    public static void main(String args[]){

        //Inicialització de la variable
        int numero = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Tria un numero");
        numero = in.nextInt(); //Llegeix el numero introduit

        if(numero % 2 == 0){ //Comprova si el numero és parell
            if(numero % 5 == 0){ //Si es parell, comprova si es divisible per 5
                System.out.println("El numero es parell i divisible per 5.");   
            }
            else if (numero % 11 == 0){ // Si no és divisible per 5, comprova si és divisible per 11
                System.out.println("El numero es parell i divisible per 11.");
            }
            else{  // Si no és divisible ni per 5 ni per 11, mostra aquest missatge
                System.out.println("El numero es parell, pero no es divisible entre 5 ni 11.");
            }
        }
        else{  // Si el número no és parell, mostra aquest missatge
            System.out.println("El numero no es parell.");
        }
    }
    
}
