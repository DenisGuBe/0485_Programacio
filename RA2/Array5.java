import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int total= 0;
        int contador5=0;
        int contador6=0;

        int resultat[];
        resultat = new int[50];

        for(int i=0; i<50; i++){
            resultat[i]= (int)(Math.random()*6)+1;
            System.out.println("El resultat " +i+ " és: "+resultat[i]);
            total +=resultat[i];
        }
        System.out.println("El total dels daus és: " +total);
        if(total%2==0){
            System.out.println("La suma total és un numero parell");
        }else{
            System.out.println("La suma total és un numero imparell");
        }
        for(int i=0; i<50; i++){
            if(resultat[i]==5){
                contador5++;
            }
            if(resultat[i]==6){
                contador6++;
            }
        }
        System.out.println("El numero 5 ha sortit "+contador5+" cops.");
        System.out.println("El numero 6 ha sortit "+contador6+" cops.");

        
    }
    
}
