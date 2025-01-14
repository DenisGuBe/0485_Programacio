import java.util.Scanner;

public class enunciat2 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);

        //Inicialitzacio de les variables
        int num = 1;
        int multiple3 =3;

        while(num>0 && num<=100){ //Mentre el numero estigui entre 1 i 100

            if(num%15==0){ //Si es multiple de 15
                System.out.println("El numero "+num+ " és multiple de 15.");
            

            while (multiple3 <= num){ //Mentre sigui multiple de 3 i no superi el numero que es multiple de 15
                System.out.print(multiple3 + " ");
                multiple3 +=3;
            }
            System.out.println();
        
            }
        num++;
         } 
    }
}
  