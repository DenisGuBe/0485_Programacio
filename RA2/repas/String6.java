package repas;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String text1;
        String text2;

        System.out.println("Introduiex el primer text");
        text1 = in.nextLine();

        System.out.println("Introdueix el segon text");
        text2 = in.nextLine();

        for(int i=0; i<text1.length(); i++){
            if(text1.length()!=text2.length()){
                System.out.println("Són diferents");
            }
        }
    }
}
