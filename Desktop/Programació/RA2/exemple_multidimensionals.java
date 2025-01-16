public class exemple_multidimensionals {
    public static void main(String[] args) {
     
        //variables
        int[][] array= new int[5][4];

        array[0][0]=1;

        //codi
        for(int i=0; i<5; i++){
            for(int j=0;j<4;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    
}
