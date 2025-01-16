import java.util.Scanner;

public class activitat3 {

    public static void main (String args[]){

        //Inicialització de les variables
        int temperatura = 0;
        int humitat = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Quina temperatura fa?");
        temperatura = in.nextInt(); //Llegeix la temperatura introduida

        System.out.println("Quin % d'humitat hi ha?");
        humitat = in.nextInt(); //Llegeix la humitat introduida

        if(temperatura <= 15){ //Si la temperatura es igual o menor de 15
            System.out.println("Cal engegar aire calent al maxim.");
        } else if (temperatura <20) { //Si la temperatura esta entre 16 i 19
            System.out.println("Cal fer moure l'aire afegint una mica de calent.");
        } else if (temperatura <=25) { //Si la temperatura esta entre 20 i 25
            System.out.println("No cal engegar l'aire.");
        } else if (temperatura >=30) { //Si la temperatura es igual o superior a 30
            System.out.println("Cal treure aire fred.");
        }

        if(humitat >95) { //Si la humitat es superior a 95%
            if(temperatura <0){ //Si la temperatura es inferior a 0
                System.out.println("Esta nevant.");
            } else if(temperatura <5){ //Si la temperatura esta entre 0 i 4
                System.out.println("Cau aiguaneu.");
            } else if(temperatura >=5){ //Si la temperatura es igual o superior a 5
                System.out.println("Esta plovent.");
            }
        } else { //Si la humitat es de 95% o menos no hi ha precipitacions
            System.out.println("No hi ha precipitacions.");
        }
    }
    
}
