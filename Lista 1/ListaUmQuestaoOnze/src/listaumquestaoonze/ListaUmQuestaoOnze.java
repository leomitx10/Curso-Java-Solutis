package listaumquestaoonze;

import java.util.Scanner;

/**** @author Leandro*/
public class ListaUmQuestaoOnze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String palavra1 = scan.nextLine().toLowerCase();
        String palavra2 = scan.nextLine().toLowerCase();
        
        int ordem = palavra1.compareTo(palavra2);
        
        if(ordem < 0 ){
            System.out.println("1." +palavra1);
            System.out.println("2." +palavra2);
        }else if(ordem > 0){
            System.out.println("1." +palavra2);
            System.out.println("2." +palavra1);
        }else{
            System.out.println(palavra1 +" eh igua a " + palavra2);
        }
        
        if(palavra1.length()>palavra2.length()){
            System.out.println(palavra1 + " tem mais caracteres.");
        }else if(palavra2.length()>palavra1.length()){
            System.out.println(palavra2 + " tem mais caracteres.");
        }else{
            System.out.println(palavra1 + " tem o mesmo numero de caracteres que " + palavra2);
        }
    } 
}
