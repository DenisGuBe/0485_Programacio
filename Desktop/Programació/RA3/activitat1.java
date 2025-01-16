import java.util.Scanner;

public class activitat1 {

    public static void main(String args[]) {

        //Inicialització de les variables
        int edatFill = 0;
        int edatPare = 0;
        int diferencia = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Quina edat te el fill?"); 
        edatFill = in.nextInt(); //Llegeix edat del fill

        System.out.println("Quina edat te el pare?");
        edatPare = in.nextInt(); //Llegeix edat del pare

        
        diferencia = edatPare-edatFill;//Calcula la diferència d'edats

        // Comprova si la diferència d'edat és menor a 25 anys
        if(diferencia < 25){
            System.out.println("La diferencia d'edat és menor a 25 anys");
        } else {
            System.out.println("La diferencia d'edat es major a 25 anys");
        }

        // Comprova si el fill és major d'edat
        if(edatFill >= 18) {
            System.out.println("El fill es major d'edat");
        } else {
            System.out.println("El fill es menor d'edat");
        }

        // Comprova si l'edat del fill és superior a la diferència d'anys amb el seu pare
        if(edatFill > diferencia) {
            System.out.println("El fill te mes anys que la diferencia d'anys amb el seu pare");        
        } else {
            System.out.println("El fill te menys anys que la diferencia d'anys amb el seu pare");
        }

        // Comprova si no es compleix cap de les condicions anteriors: diferència < 25, fill major d'edat, i edat del fill major que la diferència
        if(!(diferencia < 25 && edatFill >= 18 && edatFill > diferencia)){
            System.out.println("No es compleix cap condicio");
        }
    }
    
}
