package RA4.Herencia;

/**
 * Classe Treballador que hereta de la classe Persona i afegeix atributs específics d'un treballador,
 * com l'especialitat i el sou.
 */

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
