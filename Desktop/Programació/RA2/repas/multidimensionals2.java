package repas;

import java.util.Scanner;

public class multidimensionals2 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);

        multidimensionals2 programa = new multidimensionals2();

        int num = 0;
        int[] array1;
        int[] array2;
        int[][] arraybd;

        System.out.println("Diguis el primer numero");
        num= in.nextInt();
        array1= new int[num];
        programa.omple(array1,100);
        programa.printArray(array1);

        System.out.println("Diguis el primer numero");
        num= in.nextInt();
        array2= new int[num];
        programa.omple(array2,100);
        programa.printArray(array2);

        
        if(array1.length>array2.length){
            arraybd = new int[2][array1.length];
        }else{
            arraybd = new int[2][array2.length];
        }

        for(int i=0; i<arraybd[0].length; i ++){
            if ((array1.length - 1) >=i){
                arraybd[0][i]=array1[i];
            }else{
                arraybd[0][i]=0;
            }

            if ((array2.length - 1) >=i){
                arraybd[1][i]=array2[i];
            }else{
                arraybd[1][i]=0;
            }
        }

        programa.printArray(arraybd);


    }

    public int[] omple(int[] matriu, int max){

        for(int i=0; i<matriu.length;i++){
            matriu[i]= (int) (Math.random()*(max+1));
        }

    return matriu;
    }

    public void printArray(int[] matriu){

        for(int i=0; i<matriu.length; i++){
            System.out.print(matriu[i] + " ");
        }
        System.out.println();
    }

    public void printArray(int [][] matriu){

        for(int i=0; i<matriu.length; i++){
            for(int j=0;j<matriu[0].length;j++){
            System.out.print(matriu[i][j] + " ");
            }
        System.out.println();

        }
    }

}
