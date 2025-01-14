import java.util.Scanner;

public class tryCatchEdat{

    public static void main (String args[]){

        
        Scanner in=new Scanner(System.in); 
        int edat=0; 
        boolean error = true;

        while(error){
        try{
        System.out.println("Si us plau, escriu un la edat a comprovar?"); 
        edat= in.nextInt(); 
        error=false;
        }
        catch(Exception amin){
            in.nextLine();
            System.out.println("Excepció-->"+amin);
        }
        }


        
        if (edat<3){ 
            System.out.println("És un/a bebe."); 
        }
        else if (edat<14){ 
            System.out.println("És un nen o una nena"); 
        }
        else if (edat<25){ 
            System.out.println("És un/a jove"); 
        }
        else{ 
            System.out.println("És un/a Adult/a"); 
        }
        
    }
}