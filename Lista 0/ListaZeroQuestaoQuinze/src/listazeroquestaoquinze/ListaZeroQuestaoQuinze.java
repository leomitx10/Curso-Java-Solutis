package listazeroquestaoquinze;

import java.util.Scanner;

/**** @author Leandro*/
public class ListaZeroQuestaoQuinze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = 0; 
        int soma = 0; 
        
        do {
            int entrada = scan.nextInt(); 
            soma += entrada; 
            n++; 
        } while (n < 50); 
       
        float mediaAri = (float) soma / n;
      
        System.out.println(mediaAri);
        
        scan.close();
    }
}
