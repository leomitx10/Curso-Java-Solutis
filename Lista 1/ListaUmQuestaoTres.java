package listaumquestaotres;

import java.util.Scanner;

/** @author Leandro */
public class ListaUmQuestaoTres {
    
    public static boolean VerificaPrimo(int n) {
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 2; i < n; i++) {
            if (VerificaPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}
