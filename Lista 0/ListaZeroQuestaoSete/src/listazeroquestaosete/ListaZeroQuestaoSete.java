package listazeroquestaosete;

import java.util.Scanner;
/* @author Leandro*/
public class ListaZeroQuestaoSete {
    
    public static int[] troca(int a, int b) {
        int aux;
        
        aux = a;
        a = b;
        b = aux;
        
        return new int[] {a, b};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int[] valores = troca(A, B);
        
        System.out.println("Valor de A apos troca: " + valores[0]);
        System.out.println("Valor de B apos troca: " + valores[1]);
        
        scanner.close();
    }
}



