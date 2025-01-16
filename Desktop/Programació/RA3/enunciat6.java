import java.util.Scanner;

public class enunciat6 {
    public static void main (String args[]){

        Scanner in = new Scanner(System.in);

        //Inicialitzacio variable
        int num = 0;

        System.out.println("Entra un numero senar i major de 1");
        num= in.nextInt(); //Llegeix numero entrar

        for(int i = 0; i<num; i++){ //Variable i des del 0 fins a menor de num i cada cop sumant (salt fila)
            for(int j=0; j<num; j++){ //Variable j des del 0 fins a menor de num i cada cop sumant (fila)
                if(i==j || j==(num - 1 - i)){ //Si i=j o j=num-1-i imprimeix una x
                    System.out.print("x");
                }else{
                    System.out.print(" "); //Sino imprimeix un buit
                }
            }
            System.out.println(); //Salt de fila
        }
        

    }
}
