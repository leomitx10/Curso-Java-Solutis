package listaumquestaooito;

import java.util.Scanner;

/** @author Leandro */
public class ListaUmQuestaoOito {
    
    public static boolean verificarPalindromo(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        scanner.close();

        if (verificarPalindromo(input)) {
            System.out.println("Eh um palindromo.");
        } else {
            System.out.println("Nao eh um palindromo.");
        }
    }
}
