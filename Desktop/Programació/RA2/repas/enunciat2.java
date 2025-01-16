package repas;

public class enunciat2 {
    public static void main (String args[]){
        enunciat2 prog = new enunciat2();




    }

    public char retornaVocal(){

        String vocals="aeiou";
        char vocal=' ';
        int aleatori = (int)(Math.random()*5);

        vocal = vocals.charAt(aleatori);

        return vocal;

        // char[] vocals={'a','e','i','o','u'};
        // vocal = vocals[aleatori];
    }
    /*Retorna una vocal de forma aleatòria entre a,e,i,o,u
    @return char Només retornarà una vocal aleatòria*/

    public char retornaConsonant(){

        char consonant = ' ';
        char[] consonants={'e','b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','x', 'y','z'};
        int aleatori = (int)(Math.random()*5);

        consonant=consonants[aleatori];

        return consonant;
    }

    public boolean comprovaParaula(String lletres, String paraula){

        char lletraBuscar=' ';
        int posicio = 0;

        for(int i=0; i<paraula.length(); i++){

            lletraBuscar= paraula.charAt(i);
            posicio = lletres.indexOf(lletraBuscar);

            if (lletres.indexOf(lletraBuscar)==-1){
                return false;
            } else {
                lletres = lletres.substring(0,posicio)+ lletres.substring(posicio+1);
            }

        }
        return true;
    }

    public int creaNum(){

        int[] numeros = {1,2,3,4,5,6,7,8,9,10,25,50,75,100};
        int posicio = 0;

        posicio = (int)(Math.random()*14);

        return numeros[posicio];
    }

}
