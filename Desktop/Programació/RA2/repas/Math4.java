package repas;

import java.util.Scanner;

public class Math4 {
    public static void main (String args[]){
        Math4 programa = new Math4();

        double total = 0;

        double num = programa.numUsuari();
        total = programa.sumaNum(num, total);

        num = programa.numUsuari();
        total = programa.sumaNum(num, total);

        num = programa.numUsuari();
        total = programa.sumaNum(num, total);

        num = programa.numUsuari();
        total = programa.sumaNum(num, total);

        num = programa.numUsuari();
        System.out.println ("El total és: " + programa.sumaNum(num, total));

        double mitjana = total / 5;

        System.out.println ("La mitjana sense arrodonir és: " + mitjana);
        
        System.out.println("La mitjana a la baixa és: " + Math.floor(mitjana));

        System.out.println("La mitjana a la alça és: " + Math.ceil(mitjana));
    }

    public double numUsuari(){
        Scanner in = new Scanner(System.in);
        double numUsuari = 0.00;

        System.out.println("Diguis un numero");
        numUsuari = in.nextDouble();

        return numUsuari; 
    }

    public double sumaNum(double num, double total){
        total = total + num;

        return total;
    }
}
