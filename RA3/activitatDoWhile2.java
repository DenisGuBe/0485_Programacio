import java.util.Scanner;

public class activitatDoWhile2 {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
     int resultat = 0;
     int premi=0;
     int total=0;
     int anys=0;

     System.out.println("Introdueix la quantitat de diners.");
     premi = in.nextInt();
     do{
        resultat = total + premi;
        System.out.println("Al " + anys + " any el total és de " + premi);
        anys ++;
        premi *= 2;

     } while(premi<1000);
     System.out.println("Han pasat: " + anys);
     System.out.println("Has guannyat un total de " + resultat);
    }
    
}
