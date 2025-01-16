import java.util.Scanner;

public class Arrays9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int[] array= {786,616,854,607,488,839,51,712,192,375,476,35,334,383,348,771,887,212,736,183,529,623,88,438,368,912,971,576,602,604,498,568,621,227,10,877,390,989,459,406,594,70,596,236,968,609,497,79,422,444,193,964,60,64,164,258,956,292,240,774,617,685,17,362,356,721,234,105,451,436,695,935,813,271,216,276,101,550,778,80,652,194,515,474,323,983,444,64,386,915,856,835,887,2,110,500,477,131,163,112};
        boolean flag = true;
        int comodi;
        int comparacions=0;
        int canvis=0;

        do { //Iteracio que comprova si hi ha hagut algun canvi 
            flag = false; //Assignem que ancara no hi ha hagut cap canvi en aquesta iteracio
            
            for(int i=0; i<=(array.length-2); i++){  //Repassem casella per casella si cal fer algun canvi
                if(array[i+1]<array[i]){  //Detectem si cal fer un canvi en la casella
                    flag=true; // Idiquem que si s'han fet un canvi
                    comodi=array[i]; //Aquestes 3 ordres serveixen per intercanviar valors
                    array[i]=array[i+1];
                    array[i+1]=comodi;
                    
                    canvis ++;
                }
                comparacions ++;            
            }

        } while (flag);

        for(int i = 0; i<=(array.length-1);i++){
            if(i==0){
                System.out.print("{");
            }else if (i==(array.length-1)){
                System.out.println(array[i]+"}");
            }else{
                System.out.print(array[i]+",");
            }
        }
        
        System.out.println("S'han fet " + comparacions + " comparacions");
        System.out.println("S'han fet "+ canvis+ " canvis");
        

    }
}
