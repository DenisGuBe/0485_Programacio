package RA4.Ra4_3_Formes;

public class Triangle extends Formes {
    
    private int base;
    private int alçada;

    public Triangle(String nom,String color,String vora,int base, int alçada){
        super(nom,color,vora);
        this.base = base;
        this.alçada = alçada;
    }

    public int getBase(){
        return this.base;
    }

    public int setRadi(int B){
        return this.base=B;
    }

    public int getAlçada(){
        return this.alçada;
    }

    public int setAlçada(int A){
        return this.alçada=A;
    }

    public double area(){
        double areaTriangle=0;
        areaTriangle = (base*alçada)/2;

        return areaTriangle;
    }

    public String toString(){
        return super.toString()+"\n La base és: "+base+"\n L'alçada és: "+alçada;
    }
}
