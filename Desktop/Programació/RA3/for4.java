import java.util.Scanner;
public class for4 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        int num=0;

        System.out.println("Diguis el número de línies d'alçada");
        num = in.nextInt();

        for(int i =1; i<=num;i++){
            for(int j=1;j<=(num-1);j++){
                if(j<num-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
        }
        System.out.println();

        }
}
