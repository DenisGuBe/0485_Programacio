import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int num[];
        num = new int[10];


        for(int i=0; i<10; i++){
            num[i] = (int)(Math.random()*100)+1;
            System.out.println("El numero aleatori "+i+ " és: " +num[i]);

        }

        int max = num[0];
        int min = num[0];

        for (int i = 0; i < 10; i++) {
            if(num[i] > max){
                max = num[i];
            }
            if (num[i] < min){
                min = num[i];
            }
        }

        System.out.println("El numero més gran és: "+ max);
        System.out.println("El numero mes petit és: "+ min);



    }
    
}
