
import java.util.Scanner;

public class metodes5 {
    public static void main(String[] args) {
        String frase = "Frase de mostra per fer proves";
        int opcio = 0;

        metodes5 programa = new metodes5();

        while(true) { 
            opcio=programa.menu();

            switch(opcio){
                case 1:
                    frase = programa.demanaFrase();
                    break;
                case 2:
                    System.out.print("La frase és: ");
                    System.out.print(frase);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Hi ha  "+programa.numParaules(frase)+" paraules a la frase");
                    break;
                case 4:
                    System.out.println("Hi ha "+programa.numVocals(frase)+" vocals");
                    break;
                case 5:
                    frase=programa.restaLletra(frase);
                    break;
                case 6:
                    frase=programa.restaParaula(frase);
                    break;
                case 7:
                    frase=programa.capgiraFrase(frase);
                    break;
                case 8:
                    programa.mostraCapgirats(frase);
                    break;

                default:
                    System.out.println("Aquesta opció no existeix");
            }
        }
    }

    public int menu(){
        
        Scanner in = new Scanner (System.in);
        int opc;

        System.out.println("Tria una opció");

        System.out.println("1- Entrar una frase al sistema");
        System.out.println("2- Mosta estat frase");
        System.out.println("3- Número de paraules");
        System.out.println("4- Número de vocals");
        System.out.println("5- Elimina última lletra");
        System.out.println("6- Elimina última paraula");
        System.out.println("7- Capgira frase");
        System.out.println("8- Capgira praules per separat");

        opc=in.nextInt();
        return opc;
    }

    public String demanaFrase(){
        Scanner in = new Scanner(System.in);
        String frase;

        System.out.println("Posa la teva frase");
        frase = in.nextLine();

        return frase;
    }

    public int numParaules(String frase) {
        int espais=0;
        
        for(int i=0; i<= frase.length(); i++){
            if (frase.charAt(i) == ' '){
                espais ++;
            }
        }
        return espais+1;
    }

    public int numVocals(String frase){
        int vocals = 0;

        frase = frase.toLowerCase();

        for (int i=0; i<frase.length(); i++){
            
            switch(frase.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vocals++;
                    break;             
                default:
            }
        }
        return vocals;
    }

    public String restaLletra(String frase){

        frase = frase.substring(0, frase.length()-1);

        return frase;
    }

    public String restaParaula(String frase){

        int pos=0;

        pos = frase.lastIndexOf(' ');
        frase = frase.substring(0,pos);

        return frase;
    }

    public String capgiraFrase(String frase){
        
        String nova="";

        for (int i=frase.length()-1; i>=0; i--){

            nova=nova+frase.charAt(i);
        }
        return nova;
    }

    public void mostraCapgirats(String frase){

        String paraula="";

        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)!=' '){
                paraula=paraula+frase.charAt(i);
            }else{
                System.out.print(capgiraFrase(paraula)+" ");
                paraula="";
            }
        }
        System.out.print(capgiraFrase(paraula));
    }
}
