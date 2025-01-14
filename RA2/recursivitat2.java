
import java.util.Scanner;

public class recursivitat2 {
    public static void main(String[] args) {
        recursivitat2 programa = new recursivitat2();

        int posUsuari = 0;
        int operacions = 0;
        int inici = 0;

        posUsuari=programa.demanaNumero();

        System.out.println(programa.fibonacci(posUsuari, operacions, inici));



    }

    public int demanaNumero(){
        Scanner in = new Scanner (System.in);
        int num = 0;

        System.out.println("Diguis un número");
        num = in.nextInt();

        return num;
    }

    public int fibonacci(int posUsuari, int operacions, int inici){
        
        int resultat = inici;

        if(operacions==posUsuari){
            return resultat;
        }else {
            operacions ++;
            resultat = inici + resultat;
            return inici + fibonacci(posUsuari, operacions, inici);
            
        }
    }
}
