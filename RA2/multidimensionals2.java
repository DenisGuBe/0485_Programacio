
import java.util.Scanner;

public class multidimensionals2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int num=0;


        System.out.println("Diguis un numero del 0 al 10");
        num=in.nextInt();

        int[][] array= new int[num][num];

        //codi
        for(int i=0; i<num; i++){
            for(int j=0;j<num;j++){
                // System.out.print(array[i][j]);
                if(i==0 || i==num-1 || j==0 || j==num-1){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
    
}
