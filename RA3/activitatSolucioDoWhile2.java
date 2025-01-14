import java.util.Scanner;

public class activitatSolucioDoWhile2 {
    public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    
    int regal = 0;
    int total = 0;
    int anys = 0;

    System.out.println("Import total regal");
    regal = in.nextInt();

    if(regal<1000){

    do { 
        anys ++;
        total=total+regal;
        System.out.println("Any "+ anys+ " regal " + regal);
        regal=regal*2;

        
    } while (regal<1000);
    }

    regal=1000;
    anys ++;
    total=total + regal;
    System.out.println("Any "+ anys+ " regal " + regal);

    System.out.println("Han passat "+ anys+ "anys i el total del regal ha estat "+ total);

    } 
  
}
