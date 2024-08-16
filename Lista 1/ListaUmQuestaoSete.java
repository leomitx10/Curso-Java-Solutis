package listaumquestaosete;

/** * @author Leandro */
public class ListaUmQuestaoSete {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                System.out.println("int: " + (i / 2));
                System.out.println("double: " + ((double) i / 2));
            }
        }
    }
}
