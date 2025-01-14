package RA4.Ra4_2_Biblioteca;

public class Programa {

    public static void main(String[] args) {
        
        Biblioteca objbiblio=new Biblioteca();

        Llibre obj1 = new Llibre("Alicia en el país de las maravillas","Lewis Carrol","89988675");

        Llibre obj2 = new Llibre("La vuelta al mundo en 80 dias","Lulio Verne","333929947");

        obj1.setPags(110);
        obj2.setPags(233);

        objbiblio.afegirLlibre(obj1);
        objbiblio.afegirLlibre(obj2);

        // System.out.println(obj1.toString());
        // System.out.println(obj2.toString());

        System.out.println(obj1.getTitol()+"\n"+obj1.getAutor()+"\n"+obj1.getId()+"\n"+obj1.getPags());
        System.out.println();
        System.out.println(obj2.getTitol()+"\n"+obj2.getAutor()+"\n"+obj2.getId()+"\n"+obj2.getPags());
    }
}