import java.util.Scanner;

public class enunciat3 {
    public static void main (String args []){
        Scanner in = new Scanner(System.in);

        //Inicialitzacio de la variable
        int num = 50; //Comença del numero 

        do { 
            if(String.valueOf(num).contains("8")){ //Comprovar si el numero te el 8
                System.out.println("Aquest:" + num);  //Si el te l'imprimira aqui
            }
        num--; //Per fer el conte enrere
        } while (num>=0); //Fins al numero 
    }
    
}
