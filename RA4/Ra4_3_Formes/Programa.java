package RA4.Ra4_3_Formes;

public class Programa {
    public static void main(String[] args) {

        //EXERCICI 1-3//
        Formes obj1 = new Quadrat("Quadrat basel", "Groc", "vora vermella",8);
        Formes obj2 = new Triangle("Triangle superior", "Verd", "vora negra",8,8);
        Formes obj3 = new Rodona("Rodona punta", "Negre", "vora fuxia",3);

        // EXERCICI 1-3//
        System.out.println(obj1.toString());
        System.out.println();
        System.out.println(obj2.toString());
        System.out.println();
        System.out.println(obj3.toString());

        //EXERCICI 6//
        System.out.println(obj1.area());
        System.out.println(obj2.area());
        System.out.println(obj1.area());
    }
}
