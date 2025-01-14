import java.util.Scanner;

public class String4 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);

        String nom="Modul 0440:Programacio";

        System.out.println("Subsitutir 'a' per la 'i'"+ nom.replace('a','i'));

        System.out.println("Elimina els espais "+nom.trim());

        System.out.println("Eliminar Programació "+ nom.substring(0,12));

    }
    
}
