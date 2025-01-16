
public class enunciat2 {
    public static void main(String[] args) {
        enunciat2 programa = new enunciat2();

        char vocal = programa.retornaVocal();
        System.out.println("Vocal aleatoria " + vocal);

        char consonant = programa.retornaConsonant();
        System.out.println("Consonant aleatoria " + consonant);

        String lletres = "abchijklov";
        String paraula = "bola";
        boolean comprovacio = programa.comprovaParaula(lletres, paraula);
        System.out.println("La paraula és " + paraula + "és vàlida? " + comprovacio);


        int numero = programa.creaNum();
        System.out.println("Numero aleatori " + numero);


    }

    public char retornaVocal(){
        char[] vocals = {'a','e','i','o','u'};

        int pos = (int)(Math.random()*vocals.length);

        return vocals[pos];
    }

    public char retornaConsonant(){
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'x', 'y', 'z'};

        int pos = (int) (Math.random()*consonants.length);

        return consonants[pos];
    }

    public boolean comprovaParaula(String lletres, String paraula){
        int[] disponibles = new int[26];
        
        for (int i = 0; i< lletres.length();i++){
            char lletra = lletres.charAt(i);
            if(lletra >= 'a' && lletra <='z'){
                disponibles [lletra - 'a']++;
            }
        }

        for (int i = 0; i< paraula.length();i++){
            char lletra = lletres.charAt(i);
            if(lletra >= 'a' && lletra <='z'){
                if (disponibles [lletra - 'a'] == 0){
                    return false;
                }
                disponibles[lletra - 'a']--;
            }else{
                return false;
            }
        }

        return true;
    }

    public int creaNum(){
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25, 50, 75, 100};

        int pos = (int) (Math.random()*num.length);

        return num[pos];
    }    
}
