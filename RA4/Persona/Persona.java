package RA4.Persona;

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
