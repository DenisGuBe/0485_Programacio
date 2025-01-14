public class exmetodes {
    public static void main(String[] args) {

        exmetodes programa = new exmetodes();

        programa.hola();

        System.out.print(programa.text());
    }

    public void hola(){
        System.out.println("Hola!!");
    }

    public String text(){

        return "Hola de text";
    }
}
