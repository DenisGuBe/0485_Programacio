public class enunciat1 {
    public static void main(String[] args) {
        enunciat1 programa = new enunciat1();

        String paraulaEscollida;
        char[] paraulaEndevinar;

        paraulaEscollida = programa.demanaParaula();
        paraulaEndevinar= programa.paraulaPerLletres(paraulaEscollida);

        int intents = 9;
        char[] lletresIncorrectes= new char[26]; //son les lletres del abecedari


        boolean paraulaEncertada = false;
        while (intents>=0 && !paraulaEncertada) { //Si els intents baixen de 0 sortirà del programa.
            intents = programa.joc(intents, paraulaEndevinar, lletresIncorrectes);
            paraulaEncertada = programa.paraulaEncertada(paraulaEndevinar);
        }

        if(paraulaEncertada){
            System.out.println("Has encertat la paraula");
        }else{
            System.out.println("Ets un paquet");
        }
    }

    public String demanaParaula(){
        String paraula;

        //aqui hi haura el codi on demana una paraula per a iniciar el joc
        //hi haura un scanner que registrara la paraula

        return paraula;
    }

    public char[] paraulaPerLletres(String paraulaEscollida){
        char[] paraulaDividida; 

        //aqui passarem el String en una array unidimensional per a poder treballar lletra per lletra.

        return paraulaDividida;
    }

    public int joc(int intents, char[] paraulaEndevinar, char[] lletresIncorrectes){
        char lletra;
        int possibilitats = intents;

        //aqui hi haura un scanner que guardara la lletra introduida pel usuari
        //un for que anirà comprovant lletra per lletra si no ha encertat la lletra de la paraula es mostrarà un guió i es guardarà a l'array de llestresIncorrectes i s'imprimirà, apart el contador de possibilitats-- restarà
        //si l'encerta es mostrarà la lletra en la posició que li pertoca dins de la paraula i no es restarà cap possibilitats

        //Si es s'encerta la paraula o es gasten els intents es sortira del programa

        return possibilitats;
    }

    public boolean paraulaEncertada(char[] paraulaEndevinar){
        boolean encertada = true;
        //Aquí comprovara si hi ha guions o no amb un for que recorera lletra per lletra
        //llavors fara o un return true si s'ha encertat la paraula o un false si no l'ha encertat

        return false;
    }
    
}
