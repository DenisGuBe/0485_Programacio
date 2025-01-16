package RA4.Projecte1;

import java.util.Scanner;

public class Programa {
    public static void main (String args[]){

        Scanner in = new Scanner (System.in);
        char opcio =' ';
        String nomJugador;
        String idJugador;

        System.out.println("Quin és el nom del jugador");
        nomJugador = in.nextLine();

        System.out.println("Quin és el ID del Jugador?");
        idJugador = in.nextLine();

        Jugador nomObj = new Jugador(nomJugador, idJugador);

        while(opcio != 'F'){
            System.out.println("Menú opció");
            System.out.println("1 - Marca GOL");
            System.out.println("2 - Reb falta");
            System.out.println("3 - Comet falta");
            System.out.println("4 - Xuta");
            System.out.println("5 - Xuta a porta");
            System.out.println("6 - Targeta groga");
            System.out.println("7 - Targeta vermella");
            System.out.println("F - Sortir programa");
            System.out.println("Tria opció: ");
            opcio = in.nextLine().charAt(0);

            switch(opcio){
                case '1':
                    nomObj.augmentaGols();
                    break;
                case '2':
                    nomObj.augmentaRebudes();
                    break;
                case '3':
                    nomObj.augmentaComeses();
                    break;
                case '4':
                    nomObj.augmentaXuts();
                    break;
                case '5':
                    nomObj.augmentaPorta();
                    break;
                case '6':
                    nomObj.augmenaGrogues();
                    break;
                case '7':
                    nomObj.augmentaVermelles();
                    break;
            }
        }


        System.out.println(nomObj.toString());

        
    }
}
