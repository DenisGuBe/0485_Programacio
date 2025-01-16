package RA4.Herencia;

/**
 * Classe MainPersona que conté el mètode principal per executar i provar la creació
 * d'objectes de la classe Persona i Treballador.
 */

public class MainPersona {
    public static void main(String[] args) {
        
        Persona person = new Persona("Dani", 1955);
        Treballador treb = new Treballador("Gerard", 2001, "Profe", 3400);

        System.out.println(person.toString());
        System.out.println();
        System.out.println(treb.toString());
    }
}
