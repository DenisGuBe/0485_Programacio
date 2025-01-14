
import java.util.Scanner;

public class multidimensionals3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int num1=0;
        int num2=0;

        System.out.println("Diguis el primer numero");
        num1=in.nextInt();

        System.out.println("Diguis el segon numero");
        num2=in.nextInt();

        int[] array1= new int[num1];
        int[] array2= new int[num2];

        for(int i=0; i<num1; i++){
            array1[i]=(int)(Math.random()*50)+1;
        }

        System.out.println("Array 1:");
        for(int i=0; i<num1;i++){
            if(i==0){
                System.out.print("{"+array1[i]+",");
            }else if (i==num1-1) {
                System.out.print(array1[i]+"}");
            }else{
                System.out.print(array1[i]+",");
            }
        }

        for(int i=0; i<num2; i++){
            array2[i]=(int)(Math.random()*50)+1;
        }

        System.out.println();
        System.out.println("Array 2:");
        for(int i=0; i<num2;i++){
            if(i==0){
                System.out.print("{"+array2[i]+",");
            }else if (i==num2-1) {
                System.out.print(array2[i]+"}");
            }else{
                System.out.print(array2[i]+",");
            }
        }


        System.out.println();
        int[][] array3=new int[2][];
        array3[0] = array1;
        array3[1] =array2;

        for(int i=0; i<array3.length; i++){
            System.out.print("Array "+(i+1)+"--> ");
            for(int j=0; j<array3[i].length;j++){
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
