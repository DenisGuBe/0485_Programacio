import java.util.Scanner;

public class activitatDoWhile3 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
     int num1=0;
     int num2=0;
     char simbol;
     int resultat = 0;
     char inici ='q';

     System.out.println("Introdueix el primer numero");
     num1 = in.nextInt();

     System.out.println("Introdueix el segon numero");
     num2 = in.nextInt();

     System.out.println("Inrodueix el símbol d'operacio (+,-,*,/)");
     simbol = in.next().charAt(0);

     do { 
        switch(simbol){
            case '+':
            resultat = num1 + num2;
            System.out.println("La suma de " + num1 + " i " + num2 + " dona " + resultat);
            break;

            case '-':
            resultat = num1 - num2;
            System.out.println("La resta de " + num1 + " i " + num2 + " dona " + resultat);
            break;

            case '*':
            resultat = num1 * num2;
            System.out.println("La multiplicacio de " + num1 + " i " + num2 + " dona " + resultat);
            break;

            case '/':
            resultat = num1 / num2;
            System.out.println("La divisio de " + num1 + " i " + num2 + " dona " + resultat);
            break;
        }
        System.out.println("Per tornar a l'inici clica q");
        inici = in.next().charAt('q');
         
     } while(simbol != inici);
    }
    
}
