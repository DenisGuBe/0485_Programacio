package RA4.Herencia;

public class Treballador extends Persona{

    private String especialitat;
    private int sou=0;

    public Treballador(String nom, int any, String especialitat, int sou){
        super (nom,any);
        this.especialitat=especialitat;
        this.sou=sou;
    }

    public String toString(){
        return super.toString()+"\n"+especialitat+"\n"+sou;
    }
    
}
