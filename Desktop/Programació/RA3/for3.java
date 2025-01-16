import java.util.Scanner;
public class for3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int num=0;

        System.out.println("Tria un numero del 1 al 15");
        num= in.nextInt();

        if(num%2==0){
            for(int i=1;i<=num;i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        } else{
            for(int i=num;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
    
}
