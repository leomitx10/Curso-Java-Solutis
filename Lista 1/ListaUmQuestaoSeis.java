package listaumquestaoseis;
/** ** @author Leandro*/

public class ListaUmQuestaoSeis {
    public static void main(String[] args) {
        float t = 1f;
        int u = 1;
        
        for(int i = 15; i<=30;i++){
            if(i%2!=0){
                t = t * i;
                u = u * i;
            }
        }
        System.out.println("float: " + t);
        System.out.println("int: "+ u);
    }
}
