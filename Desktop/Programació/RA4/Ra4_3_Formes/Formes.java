package RA4.Ra4_3_Formes;

public class Formes {
    
    private String nom;
    private String color;
    private String vora;

    public Formes(String nom, String color, String vora){
        this.nom=nom;
        this.color=color;
        this.vora=vora;
    }

    public String getNom(){
        return this.nom;
    }

    public String setNom(String n){
        return this.nom=n;
    }

    public String getColor(){
        return this.color;
    }

    public String setColor(String c){
        return this.color=c;
    }

    public String getVora(){
        return this.vora;
    }

    public String setVora(String v){
        return this.vora=v;
    }

    public String toString(){
        return nom+"\n"+color+"\n"+vora;
    }
}
