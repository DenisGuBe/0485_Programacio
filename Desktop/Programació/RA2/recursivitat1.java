
import java.util.Scanner;

public class recursivitat1 {
    public static void main(String[] args) {
        recursivitat1 programa = new recursivitat1();

        int numUsuari = 0;


        numUsuari = programa.demanaNumero();

        System.out.println(programa.factorial(numUsuari));

    }

    public int demanaNumero(){
        Scanner in = new Scanner (System.in);
        int num = 0;

        System.out.println("Diguis un número");
        num = in.nextInt();

        return num;
    }

    public int factorial(int numUsuari){
        if(numUsuari ==1){
            return numUsuari;
        } else{
            return numUsuari * factorial(numUsuari -1);
        }
    }

}
