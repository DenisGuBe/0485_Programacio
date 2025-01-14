
import java.util.Scanner;

public class metodes1 {
    public static void main(String[] args) {
        
        metodes1 programa = new metodes1();

        float x;
        float y;
        
        x=programa.usuari();
        y=programa.usuari();

        System.out.println("La suma és: " + programa.suma(x,y));
        System.out.println("La divisio és: " + programa.divisio(x,y));

    }
    
    public double suma (float x, float y){
        return x+y;
    }

    public double divisio (float x, float y){
        return x/y;
    }

    public float usuari (){
        Scanner in = new Scanner (System.in);

        float num1;


        System.out.println("Introdueix un numero");
        num1 = in.nextFloat();


        return num1;    
    }

}
