package listaumquestaonove;

import java.util.Scanner;

/*** @author Leandro */
public class ListaUmQuestaoNove {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float r = scan.nextFloat();
        
        float area = (float) (Math.PI * Math.pow(r, 2));
        
        float areaA = Math.round(area);
       
        System.out.println("Area do circulo: " + areaA);
    }
}
