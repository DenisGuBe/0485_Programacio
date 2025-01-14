package repas;

public class arrays5 {
    public static void main (String args[]){

        int array[] = new int [50];
        int numRandom = 0;
        int resultat = 0;
        int count5 = 0;
        int count6 = 0;

        for(int i = 0; i<50; i++){
            numRandom = (int) (Math.random()*6+1);
            array[i] = numRandom;

            resultat = resultat + numRandom;

            if (numRandom==5){
                count5++;
            } else if (numRandom==6){
                count6++;
            }
            
        }

        System.out.println("Han sortit "+ count5 + " cincos");

        System.out.println("Han sortit "+ count6 + "   sisos");

        System.out.println("La suma total és: " + resultat);

            if(resultat % 2==0){
                System.out.println("El resultat es parell");
            } else{
                System.out.println("El resultat es senar");
            }
    }
}
