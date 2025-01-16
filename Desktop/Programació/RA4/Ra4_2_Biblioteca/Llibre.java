package RA4.Ra4_2_Biblioteca;

public class Llibre {
    private String titol=new String();
    private String autor=new String();
    private String id=new String();
    private int pagines;

    public Llibre(String titol, String autor, String id){
        this.titol = titol;
        this.autor = autor;
        this.id = id;
    }

    public String getTitol(){
        return this.titol;
    }

    public void setTitol(String t){
        this.titol=t;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String a){
        this.autor=a;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String i){
        this.id=i;
    }

    public int getPags(){
        return this.pagines;
    }

    public void setPags(int p){
        this.pagines=p;
    }

    public String toString(){


        return "\n"+titol + "\n"+autor + "\n"+id; 
    }
}
