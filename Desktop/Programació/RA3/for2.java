import java.util.Scanner;

public class for2 {
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);

    int num=0;

    System.out.println("Diguis un numero");
    num = in.nextInt();

    System.out.println("La taula de multiplicar del "+ num+" és: ");

    for(int i=0;i<=10;i++){
        System.out.println(num+" x "+i+"="+(num*i));
    }
}
    
}
