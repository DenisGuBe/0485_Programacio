import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);

        String text;
        String text2;
        boolean comparacio = true;

        System.out.println("Posar el primer text");
        text = in.nextLine();

        System.out.println("Posar el segon text");
        text2 = in.nextLine();

        if(text.length() != text2.length()){
            System.out.println("Els textos són diferents");
        } else{
            comparacio=true;

            for (int i = 0; i<text.length(); i++){
                if (text.charAt(i)!=text2.charAt(i)){
                    comparacio = false;
                    break;
                }
            }

            if(comparacio){
                System.out.println("Els textos son iguals");
            } else {
                System.out.println("Els textos no són iguals");
            }
        }

    }
}
