import java.util.Scanner;
public class activitatWhile4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        char operacio;
        int resultat = 0;
        char inici= 'q';

       

        

        System.out.println("Posa el primer numero");
        num1= in.nextInt();

        System.out.println("Posa el segon numero");
        num2= in.nextInt();

        System.out.println("Tria la operacio +,-,*,/");
        operacio= in.next().charAt(0);

        while(num1>1){

        switch(operacio){
            case '+':
            resultat =num1 + num2;
            System.out.println("La suma de " + num1 + " i " + num2 + "és: " + resultat);
            break;

            case '-':
            resultat =num1 - num2;
            System.out.println("La resta de " + num1 + " i " + num2 + "és: " + resultat);
            break;

            case '*':
            resultat =num1 * num2;
            System.out.println("La multiplicacio de " + num1 + " i " + num2 + "és: " + resultat);
            break;

            case '/':
            resultat =num1 / num2;
            System.out.println("La divisio de " + num1 + " i " + num2 + "és: " + resultat);
            break;

        }
        System.out.println("Per tornar a l'inici clica q");
        inici = in.next().charAt('q');

      } 
    }
    
}
