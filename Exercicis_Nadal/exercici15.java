package Exercicis_Nadal;

public class exercici15 {
    public static void main (String args[]){

        int variable1 = 2;
        int variable2 = 5;
        int comodin = 0;

        System.out.println("La variable 1 és: "+variable1+" la variable 2 és: "+variable2);

        comodin=variable1;
        variable1=variable2;
        variable2=comodin;

        System.out.println("La variable 1 és: "+variable1+" la variable 2 és: "+variable2);
    }
}
