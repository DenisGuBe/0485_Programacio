public class Arrays11 {
    public static void main(String[] args) {
        int[]array={786,616,854,607,488,839,51,712,192,375,476,35,334,383,348,771,887,212,736,183,529,623,88,438,368,912,971,576,602,604,498,568,621,227,10,877,390,989,459,406,594,70,596,236,968,609,497,79,422,444,193,964,60,64,164,258,956,292,240,774,617,685,17,362,356,721,234,105,451,436,695,935,813,271,216,276,101,550,778,80,652,194,515,474,323,983,444,64,386,915,856,835,887,2,110,500,477,131,163,112};
        boolean flag=true;
        int comodi;
        int pos = 0;
        int comparacions=0;
        int canvis=0;
        
        long startTime = System.nanoTime();


        
        for(int i=1; i<(array.length);i++){
            pos=i;
            for(int j=i-1;j>=0;j--){
                if(array[j]>array[i]){
                    pos=j;
                    canvis++;
                }
                comparacions++;
            }
            comodi=array[i];
            for(int q=i; q>pos; q--){
                array[q]=array[q-1];
                canvis++;
            }
            array[pos]=comodi;
            canvis++;
        }

        long endTime = System.nanoTime() - startTime;

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
        System.out.println("S'han fet "+ canvis + " canvis");
        System.out.println("S'ha executat en "+ endTime + " milisegons");
    }
}
