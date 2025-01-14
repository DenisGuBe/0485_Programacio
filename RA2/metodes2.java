
import java.util.Scanner;

public class metodes2 {
    public static void main(String[] args) {
        metodes2 programa= new metodes2();

        String arraymes [];
        int mes=0;
        String resposta1;

        mes=programa.usuari();

        arraymes = programa.array1();

        resposta1=programa.resposta(mes,arraymes);

        
        System.out.println("El mes selccionat és: "+resposta1);

    }

    public String[] array1(){
        String[] mesos={"Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Setembre","Octubre","Novembre","Desembre"};
        
        return mesos;
    }

    public int usuari(){
        Scanner in= new Scanner (System.in);

        int num;

        System.out.println("Diguis el numero del mes");
        num = in.nextInt();

        return num;
    }

    public String resposta(int mes, String []arraymes){
        if(mes>=1 && mes <=12){
            return arraymes[mes-1];
        } else{
            return "Més invalid";
        }
        

        
    }
}
