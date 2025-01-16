import java.util.Scanner;

public class Math3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double numa=0;
        int num=0;
        boolean encert = false;
        
        while(true){
            numa= Math.random();
            numa = (int) (numa*50) + 1;
            System.out.println("Introdueix un numero del 1 al 50");
            
            for(int i=1;i<=5;i++){
                num = in.nextInt();
                if(numa>num){
                    System.out.println("El numero és major");
                } else if (numa<num) {
                    System.out.println("El numero es menor");
                } else {
                    System.out.println("Has encertat el numero");
                    break;
                }

            }
            if(encert){
            System.out.println("Se t'han acabat el intents");
            }
            System.out.println();
            
        }
        
    }
    
}
