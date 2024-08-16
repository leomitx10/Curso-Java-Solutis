package listaumquestaocinco;

import java.util.Scanner;

/** ** @author Leandro*/
public class ListaUmQuestaoCinco {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int dia = scan.nextInt();
    
    switch(dia){
        case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terca-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("O numero deve ser de 1 a 7");
                break;
        }
    scan.close();
    }
}
