package listaumquestaodois;

import java.util.Scanner;

/*** @author Leandro*/
public class ListaUmQuestaoDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        if (x>y){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
    }
}
