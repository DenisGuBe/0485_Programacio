import java.util.Scanner;

public class enunciat1 {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);

        //Inicialitzacio de la variable
        int num=0;
        
        System.out.println("Diguis un numero");
        
        while(true){
            num = in.nextInt(); //Llegeix el numero seleccionat
            if(num%2==0 && num<0 && num%7==0){ //Comprova si el numero es parell, negatiu i divisible per 7
                break;
            }else{
                System.out.println("Pots tornar a introduir un numero"); //Si no compleix les tres condicions anteriors pot tornar a introduir un numero
            }
        
        }
        System.out.println("El sistema s'ha apagat"); //Quan compleix les tres condicions el sistema s'apaga
    }
    
}
