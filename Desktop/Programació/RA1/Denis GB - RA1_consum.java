import java.util.Scanner;

public class MyClass {
    
    public static void main(String args[]) {
        float litres = 0;
        float consum = 0;
        float kilometres = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Quants litres has posat de gasolina?");
        litres = in.nextFloat();

        System.out.println("Quant consumeix el teu cotxe als 100 kilometres?");
        consum = in.nextFloat();

        kilometres = litres / consum * 100;
        System.out.println("Podras fer" + kilometres + "km");
    }

}

/*import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {
        int donuts = 0;
        int persones = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Quants donuts hi ha?");
        donuts = in.nextInt();

        System.out.println("Quantes persones sou?");
        persones = in.nextInt();

        if (donuts % persones == 0) {
            System.out.println("Es poden repartir els donuts sense que en sobrin.");
        } else {
            System.out.println("No es poden repartir els donuts, en sobrarien.");
        }
    }
}