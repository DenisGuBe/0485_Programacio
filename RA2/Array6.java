import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String ciutat;

        char caracters[];

        System.out.println("Escriu el nom de una ciutat");
        ciutat = in.nextLine();

        caracters =ciutat.toCharArray();

        System.out.println("La ciutat introduida te " +ciutat.length()+" caracters");

        for(int i=caracters.length-1; i>=0; i--){
            System.out.println(caracters[i]);
        }

        
    }
    
}
