package RA4.Ra4_3_Formes;

public class Quadrat extends Formes {
    
    private int costat;

    public Quadrat(String nom,String color,String vora,int costat){
        super(nom, color, vora);
        this.costat=costat;
    }

    public int getCostat(){
        return this.costat;
    }

    public int setCostat(int C){
        return this.costat=C;
    }

    public double area(){
        double areaQuadrat=0;
        areaQuadrat = costat*2;

        return areaQuadrat;
    }

    public String toString(){
        return super.toString()+"\n El costat és: "+costat;
    }
}
