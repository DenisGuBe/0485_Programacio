import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String text;

        System.out.println("Posa un text qualsevol");
        text=in.nextLine();

        System.out.println("El text en majuscules:" + text.toUpperCase());



    }
    
}
