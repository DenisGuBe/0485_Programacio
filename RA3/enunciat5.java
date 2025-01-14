import java.util.Scanner;

public class enunciat5 {
    public static void main (String args[]){

        Scanner in = new Scanner (System.in);

        for(int i=1; i<=100; i++){ //Inicialitzacio variable i, inicie a 1 fins a 100 i va sumant

            if(i%2==0){ //Si es parell
                if(i%5==0){ //Si es multiple de 5
                    System.out.println(i+ " es parell i multiple de 5"); //Imprimira el numero amb la seva frase
                }
            }else{ //Si es senar
                if(i%7==0){ //Si es multiple de 7
                    System.out.println(i+ " es senar i multiple de 7"); //Imprimira el numero amb la seva frase
                }
            }

        }
    }
    
}
