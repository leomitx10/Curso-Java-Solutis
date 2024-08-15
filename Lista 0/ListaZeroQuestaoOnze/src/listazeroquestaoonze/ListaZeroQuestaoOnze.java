package listazeroquestaoonze;

import java.util.Scanner;
/*** @author Leandro*/
public class ListaZeroQuestaoOnze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String entrada = scan.nextLine(); 
        
        if (entrada.equals("001")) {
            System.out.println("Parafuso");
        } else if (entrada.equals("002")) {
            System.out.println("Porca");
        } else if (entrada.equals("003")) {
            System.out.println("Prego");
        } else {
            System.out.println("Diversos");
        }
        
        scan.close(); 
    }
}



