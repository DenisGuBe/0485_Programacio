package Preparacio;
import java.util.Scanner;

public class anidat2 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);

        int notamat = 0;
        int notacas = 0;
        int notaang = 0;

        System.out.println("Quina nota has tret a Matematiques?");
        notamat= in.nextInt();

        System.out.println("Quina nota has tret a Castella?");
        notacas= in.nextInt();

        System.out.println("Quina nota has tret a Angles?");
        notaang= in.nextInt();

        if (notamat<=49){
            System.out.println("A matematiques has suspes");
        } else if (notamat <=69){
            System.out.println("A matematiques has tret un be");
        } else if (notamat <=89){
            System.out.println("A matematiques has tret un notable");
        } else if (notamat <=100){
            System.out.println("A matematiques has tret un excelent");
        }

        if (notamat>=90 && (notaang <90|| notacas <90)){
            System.out.println("Cal que s'esforci tant com a matematiques");
        } 
        
        else if (notamat>=50 && notamat<=89 ){
            if (notacas>notamat && notaang>notamat){
                System.out.println("S'hauria d'esforça mes en matematiques");
            } else if (notacas>notamat){
                System.out.println("Has tret millor nota a Castella");
            } else if (notaang>notamat){
                System.out.println("Ha tret millor nota a angles");
            } else if (notacas<notamat && notaang<notamat){
                System.out.println("Hauria d'esforçar-se molt mes");
            }
        } 
        else if (notamat<50) {
            if (notacas>=50 && notaang>=50){
            System.out.println("Ha de treballar mes per aprovar mates");
            } else if (notacas<50 && notaang<50){
                System.out.println("Hauria de fer un planetejament");
            }
        }
        
    }
}
