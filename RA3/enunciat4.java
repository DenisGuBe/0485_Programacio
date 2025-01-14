import java.util.Scanner;

public class enunciat4 {
    public static void main (String[]args){

        Scanner in = new Scanner (System.in);

        //Inicialitzacio de les variables
        int num = 3;
        int usuari;

        do { 
            System.out.println("Tria un numero del 1 al 10");
            usuari = in.nextInt(); //Registra el numero entrat

            if(usuari<1 || usuari>10){ //Si no introdueix un numero entre el 1 i 10
                System.out.println("Numero incorrecte");//Impirimira aquest missatge
                continue;
            }

            num = num * usuari; //Per a acumular els punts

            System.out.println("El resultat es: " +num);//Imprimeix el punts que te sent parell

        } while (num%2==0); // Mentre sigui parell tornara a demanar un numero per a multiplicar

        System.out.println("La puntuacio final es: "+num); //Quan surti parell sortira els punts finals


    }
    
}
