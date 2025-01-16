package RA4.Herencia;

/**
 * Classe Persona que defineix les característiques bàsiques d'una persona,
 * com el nom i l'any de naixement.
 */

public class Persona {
    
    private String nom;
    private int anynaixement;

    public Persona (String nom, int any){
        this.nom = nom;
        this.anynaixement=any;
    }

    public String toString(){
        return nom+"\n"+anynaixement;
    }
}
