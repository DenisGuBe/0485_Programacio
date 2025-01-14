package repas;

import java.util.Scanner;

public class arrays6 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);

        String ciutat = " ";

        System.out.println("Diguis una ciutat");
        ciutat = in.nextLine();

        char array [];

        array = ciutat.toCharArray();

        System.out.println("Té aquest caracters: "+ ciutat.length());

        for(int i = array.length-1; i>=0; i--){
            System.out.print(array[i]);
        }
    }
}
