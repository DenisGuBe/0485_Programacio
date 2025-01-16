public class multidimensionals1 {
    public static void main(String[] args) {
     
        //variables
        String[][] array= new String[3][3];

        array[0][0]="X";
        array[0][1]="O";
        array[0][2]="X";
        
        array[1][0]=" ";
        array[1][1]="O";
        array[1][2]=" ";
        
        array[2][0]=" ";
        array[2][1]="X";
        array[2][2]=" ";

        //codi
        for(int i=0; i<3; i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
