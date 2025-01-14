import java.util.Scanner;

public class MyClass {
    
    public static void main(String args[]) {
        int preu = 0;
        int diners = 0;
        int canvi = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Quant val la poma?");
        preu = in.nextInt();

        System.out.println("Amb quants diners has pagat?");
        preu = in.nextInt();

        canvi = diners - preu;
        System.out.println("El canvi serà de" + canvi);
    }

}
