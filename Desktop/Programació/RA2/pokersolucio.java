public class pokersolucio {

    public static void main(String[] args) {
        
    }

    public int[][] barallaCartes(){
        int[][] cartes = new int [5][52];

        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                cartes [(i*13)+j][0] = i;//marquem pal
                cartes [(i*13)+j][1] = i;//marquem num de carta
            }
        }
        return cartes;
    }
    
}
