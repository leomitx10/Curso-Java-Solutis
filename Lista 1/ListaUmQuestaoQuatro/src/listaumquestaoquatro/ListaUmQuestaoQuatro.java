package listaumquestaoquatro;

import java.util.Scanner;

/** ** @author Leandro*/
public class ListaUmQuestaoQuatro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float m = scan.nextFloat();
        
        float km = m * 1.60934f;
        
        System.out.println(km);
        
        scan.close(); 
    }
}
