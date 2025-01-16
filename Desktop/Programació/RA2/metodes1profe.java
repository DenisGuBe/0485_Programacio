public class metodes1profe {
    public static void main(String[] args) {
         
        float resultsuma;
        float resultdiv;

        metodes1profe programa = new metodes1profe();

        programa.print(float , float );


    }

    public float suma (float num1, float num2){
        float total = num1 + num2;
        return total;
    }

    public float divisio (float num1, float num2){
        float resultat = num1/num2;
        return resultat;
    }

    public void print (float sum, float div){
        System.out.println (sum+" "+div);
    }
}
