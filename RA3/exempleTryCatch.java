import java.util.Scanner;

public class exempleTryCatch{

    public static void main (String args[]){

        
        Scanner in=new Scanner(System.in); 
        int numero = 0; 
        
        try{
        System.out.println("Si us plau, escriu un número?"); 
        numero= in.nextInt(); 
        }
        catch(Exception amin){
            System.out.println("Excepció-->"+amin);
        }

        finally{
        if (numero>=0){ 
            System.out.println("El número és positiu"); 
        }
        else{ 
            System.out.println("El número és negatiu"); 
        }
        }
        in.close();
    }
}