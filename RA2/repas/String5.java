package repas;
import java.util.Scanner;


public class String5 {
    public static void main (String args[]) {

        Scanner in = new Scanner (System.in);

        String text = "";
        boolean capicua = true;

        System.out.println("Posa un text");
        text = in.nextLine();

        System.out.println("Text en majuscules: " + text.toUpperCase());

        for(int i=0; i< (int) (text.length()/2); i++){
            if(text.charAt(i) != text.charAt((text.length()-1)-i)){
                capicua = false;
                break;
            }
        }
          

        if(capicua){
            System.out.println("És capicua");
        }else{
            System.out.println("No és capicua");
        }
    }    
}
