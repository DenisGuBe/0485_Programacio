package RA4.Persona;

/**
 * Classe Persona que defineix els atributs bàsics d'una persona com el nom, cognom, DNI, edat, alçada i pes.
 * Conté els mètodes per establir i obtenir el nom de la persona.
 */

public class Persona {
    
    private String nom;
    public String cognom;
    public String dni;
    public int edat;
    public int cmaltura;
    public int kgs;

    public Persona(String nom, String dni){
        this.nom = nom;
        this.dni = dni;

    }


    public void setNom(String nombre){
        nom = nombre;
        
    }

    public String getNom(){
        return nom;

    }
}
