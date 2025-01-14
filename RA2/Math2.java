import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double dau = 0;
        double dau2 = 0;
        int contador8= 0;

        for (int i=1; i<=6; i++){
            dau = Math.random();
            dau = dau*12 + 1;
            System.out.println("Tirada " + i + " ha sortit numero " + (int)dau);
           
        }

        for (int j=1; j<=24;j++){
            dau2=Math.random();
            dau2 = (int) (dau2*12) + 1;
            System.out.println("Tirada "+ j+ " ha sortit numero " + (int)dau2);
            if(dau2 == 8){
                contador8++;
            }

            

        
        }
        if (contador8 >=2){
            System.out.println("Compleix l'estadistica");
        }else{
            System.out.println("No compleix");
        }

    }
    
}
