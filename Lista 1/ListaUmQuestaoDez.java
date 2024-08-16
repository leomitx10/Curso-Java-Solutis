package listaumquestaodez;

import java.util.Scanner;

/**** @author Leandro*/
public class ListaUmQuestaoDez {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       
        String texto = scan.nextLine();
        
        int v = 0; 
        int con = 0;
        int e = 0;
        
        for (char c : texto.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1){ 
                v++;
            }
            else if (c == ' '){ 
                e++;
            }
            else if (Character.isLetter(c)){ 
                con++;
            }
        }
        
        System.out.println("Vogais: " + v);
        System.out.println("Espacos: " + e);
        System.out.println("Consoantes: " + con);
    }
}

