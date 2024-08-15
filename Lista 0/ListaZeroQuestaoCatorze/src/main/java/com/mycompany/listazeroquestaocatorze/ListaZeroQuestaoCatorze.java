package com.mycompany.listazeroquestaocatorze;

import java.util.Scanner;
/*** @author Leandro */
public class ListaZeroQuestaoCatorze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = 0;
        int soma = 0;
        
        while (n < 50) {
            int entrada = scan.nextInt();
            soma += entrada;
            n++;
        }
        
        float mediaAri = (float) soma / n;
      
        System.out.println(Float.toString(mediaAri));
        
        scan.close();
    }
}



