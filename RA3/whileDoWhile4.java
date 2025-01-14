import java.util.Scanner;

public class whileDoWhile4 {
    public static void main(String[]args){
Scanner in = new Scanner (System.in);
        int numero = 0;
        int contador = 0;
        int columnes =0;

        System.out.println("Diguis un número del 1 al 15");
        numero = in.nextInt();

        columnes=numero;
        while(numero>0){
            contador=0;
            while(columnes >= (numero+contador)){
                contador++;
                System.out.print(contador);
            }
            

            System.out.println();
            numero--;
        }
        

    }
    
}
