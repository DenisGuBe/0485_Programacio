package repas;

public class enunciat1prova {
    public static void main (String args[]){
        enunciat1prova prog = new enunciat1prova();

        int numSecret=0;
        int intents = 0;
        boolean seguir = true;

        numSecret = prog.generarNumSecret();

        while (true) { 
        prog.mostrarEstat(intents);
        }

    }

    /*
     * generarNumSecret
     * Aqui generarem el numero secret amb un (int)(Math.random()*100+1)
     * @return int amb el numero secret
     */

    /*
     * mostrarEstat
     * @param fallos - int serien els cops que ha fallat en endevinar el numero
     */

    /*
     * endevinarNombre
     * @param numEndevinar - int amb el numero secret que ha d'endevinar
     * @param fallos - int amb el numero d'erros que ha fet
     * Aqui tindriam un int per a guardar el numero que introdueix l'usuari
     * Llavors fariam una comparativa per a veure si el numero introduit amb l'aleatori és més gran o més petit per a informar-ho
     * En cas de que l'encertes o arribes a 10 intents posariam un seguir = false
     */

}
