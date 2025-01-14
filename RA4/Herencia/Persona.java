package RA4.Herencia;

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
