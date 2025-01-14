package Preparacio;

import java.util.Scanner;

public class anidat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nom;
        int quantitat=0;
        double preu=0;
        double total=0;
        final double descompte5=0.05;
        final double descompte10=0.1;

        System.out.println("Introdueix el producte: ");
        nom = in.nextLine();

        System.out.println("Introdueix la quantitat: ");
        quantitat = in.nextInt();

        System.out.println("Introdueix el preu per unitat: ");
        preu = in.nextDouble();

        total = quantitat*preu;

        if (quantitat<10){
            System.out.println("Compra basica");
        } else if (quantitat<50){
            System.out.println("Compra standard");
            if (quantitat==33){
            System.out.println("El nanooo!");
            }
            total = total-(total*descompte5);
        }
        else if (quantitat > 50){
            System.out.println("Compra amplia");
            total =total-(total*descompte10);
        }

        
        System.out.println("La compra total despres del descompte es de " +total);
        
        if (total>1000){
            System.out.println("Gràcies per la compra. Disposa d'un regal sorpresa");
        }else {
            System.out.println("Gracies per la compra");
        }
    }
    
}
