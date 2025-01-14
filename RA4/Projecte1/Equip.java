package RA4.Projecte1;

public class Equip {
    
    public String[] jugadors = new String[5];
    public String nom;
    public String logo;
    public String localitat;
    public String dni;


    public Equip (String nom, String dni){
        this.nom = nom;
        this.dni = dni;

    }

    public String[] getJugadors(){
        return jugadors;
    }

    public String getNom(){
        return nom;
    }

    public String getLogo(){
        return logo;
    }

    public String getLocalitat(){
        return localitat;
    }

    public String getDni(){
        return dni;
    }
}
