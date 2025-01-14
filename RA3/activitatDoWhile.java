import java.util.Scanner;

public class activitatDoWhile {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;
    int resultat = 0;


    do { 
    System.out.println("Posa el primer número");
    num1 = in.nextInt();

    System.out.println("Posa el segon número");
    num2= in.nextInt();

    resultat = num1 + num2;
    System.out.println("El resultat es: " + resultat); 

    } while (num1>0 && num2>0);
        



    }
}
