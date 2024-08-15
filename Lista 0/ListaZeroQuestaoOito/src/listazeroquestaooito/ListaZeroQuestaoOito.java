package listazeroquestaooito;

import java.util.Scanner;
/*** @author Leandro */
public class ListaZeroQuestaoOito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        if(num%2==0){
            System.out.println(num + " eh par");
        }else{
            System.out.println(num + " nao eh par");
        }
        scan.close();
    }
}






