import java.util.Scanner;

public class activitat4 {
    public static void main(String[] args) {
     
     Scanner in = new Scanner (System.in);
     
     //Inicialitzacio de la variable
     int opcio=0;

     //Apareix el menu amb totes les diferents opcions
     System.out.println("Menu");
     System.out.println("Opcio 1");
     System.out.println("Opcio 2");
     System.out.println("Opcio 3");
     System.out.println("Opcio 4");
     System.out.println("Opcio 5");
     System.out.println("Opcio 6");
     System.out.println("Tria una opcio.");
     opcio = in.nextInt(); //Llegeix la opcio escollida

     switch(opcio){
        case 1: //Ha triat opcio 1
        System.out.println("Has triat opcio 1.");
        break;
        case 2: //Ha triat opcio 2
        System.out.println("Has triat opcio 2.");
        break;
        case 3: //Ha triat opcio 3
        System.out.println("Has triat opcio 3.");
        break;
        case 4: //Ha triat opcio 4
        System.out.println("Has triat opcio 4.");
        break;
        case 5: //Ha triat opcio 5
        System.out.println("Has triat opcio 5.");
        break;
        case 6: //Ha triat opcio 6
        System.out.println("Has triat opcio 6.");
        break;
        default: //S'ha equivocat d'opció
        System.out.println("Has triat una opcio no valida.");
        break;
     }

    }
}
