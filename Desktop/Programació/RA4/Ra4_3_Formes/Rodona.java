package RA4.Ra4_3_Formes;

public class Rodona extends Formes {
    
    private int radi;

    public Rodona(String nom,String color,String vora,int radi){
        super(nom, color, vora);
        this.radi = radi;
    }

    public int getRadi(){
        return this.radi;
    }

    public int setRadi(int R){
        return this.radi=R;
    }

    public double area(){
        double areaRodona=0;
        areaRodona = (radi*2)*3.14;

        return areaRodona;
    }

    public String toString(){
        return super.toString()+"\n El radi és "+radi;
    }
}
