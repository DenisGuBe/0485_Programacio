import java.util.Scanner;

public class activitat5 {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        //Inicialitzacio de les variables
        char simbol;
        char lletra= 'b';

        System.out.println("Tria una lletra de les següents: b,e,r,m,p");
        simbol = in.next().charAt(0); //Llegeix el caracter que ha escollit

        switch(simbol){
            case 'b': //Ha clicat la b
            System.out.println("Benvingut-benvinguda!");
            break;
            case 'e'://Ha clicat la e
            System.out.println("Sortida autoritzada");
            break;
            case 'r': //Ha clicat la r
            System.out.println("Retorn de claus");
            break;
            case 'm': //Ha clicat la m
            System.out.println("Benvingut-benvinguda!");
            System.out.println("Sr. o Sra.");
            break;  
            case 'p': //Ha clicat la p
            System.out.println("Porta tancada");
            break;
            default: //Ha clicat una lletra que no era correcta
            System.out.println("Gràcies per la seva visita");
            break;
        }
    }
}
