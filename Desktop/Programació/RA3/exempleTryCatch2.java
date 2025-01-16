import java.util.Scanner;

public class exempleTryCatch2{

    public static void main (String args[]){

        
        Scanner in=new Scanner(System.in); 
        int numero = 0; 
        boolean error = true;
        

        while(error){
        try{
        System.out.println("Si us plau, escriu un número?"); 
        numero= in.nextInt(); 
        error = false;
        }
        catch(Exception amin){
            in.nextLine();
            System.out.println("Excepció-->"+amin);
        }
        }

        
        if (numero>=0){ 
            System.out.println("El número és positiu"); 
        }
        else{ 
            System.out.println("El número és negatiu"); 
        }
        }
        
    
}