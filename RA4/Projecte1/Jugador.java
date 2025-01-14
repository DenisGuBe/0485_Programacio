package RA4.Projecte1;

public class Jugador {
    
    public String nom;
    public String dni;
    public int rebudes;
    public int comeses;
    private int gols;
    private int xuts;
    private int porta;
    private int grogues;
    private int vermelles;
    
    // private int dorsal;
    
    // private String posicio;

    public Jugador(String nom, String dni){

        this.nom = nom;
        this.dni = dni;
        rebudes = 0;
        comeses = 0;
        gols = 0;
        xuts = 0;
        porta = 0;
        grogues = 0;
        vermelles = 0;

    }

    public String getNom(){
        return nom;
    }

    public String getDni(){
        return dni;
    }

    public int getRebudes(){
        return rebudes;
    }

    public void augmentaRebudes(){
        rebudes++;
    }

    public int getComeses(){
        return comeses;
    }

    public void augmentaComeses(){
        comeses++;
    }

    public int getGols(){
        return gols;
    }

    public void augmentaGols(){
        gols++;
    }

    public int getXuts(){
        return xuts;
    }

    public void augmentaXuts(){
        xuts++;
    }

    public int getPorta(){
        return porta;
    }

    public void augmentaPorta(){
        porta++;
    }

    public int getGrogues(){
        return grogues;
    }

    public void augmenaGrogues(){
        grogues++;
    }

    public int getVermelles(){
        return vermelles;
    }
    
    public void augmentaVermelles(){
        vermelles++;
    }

    public String toString(){
        String cadena="";

        cadena = "Nom de \" jugador: " + nom + "\n";
        cadena = cadena + "Identificador: " + dni + "\n";
        cadena = cadena + "\tGols: \t\t\t" + gols + "\n";
        cadena = cadena + "\tFaltes comeses: \t" + comeses + "\n";
        cadena = cadena + "\tFaltes rebudes: \t" + rebudes + "\n";
        cadena = cadena + "\tXuts: \t\t\t" + xuts + "\n";
        cadena = cadena + "\tXuts a porta: \t\t" + porta + "\n";
        cadena = cadena + "\tTargetes grogues: \t" + grogues + "\n";
        cadena = cadena + "\tTargetes vermelles: \t" + vermelles + "\n";

        return cadena;
    }



}
