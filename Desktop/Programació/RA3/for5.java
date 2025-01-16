import java.util.Scanner;

public class for5 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        int num= 0;

        System.out.println("Diga'm l'altura del quadrat");
        num = in.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1; j<=num;j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
    
}
