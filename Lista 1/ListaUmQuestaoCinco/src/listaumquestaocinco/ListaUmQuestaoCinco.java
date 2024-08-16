package listaumquestaocinco;

import java.util.Scanner;

/** @author Leandro */
public class ListaUmQuestaoCinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 7: ");
        int dia = scan.nextInt();

        String[] diaSemana = { "Segunda-feira", "Terca-feira", "Quarta-feira", 
                                "Quinta-feira", "Sexta-feira", "Sabado", "Domingo"};

        if (dia >= 1 && dia <= 7) {
            System.out.println(diaSemana[dia - 1]);
        } else {
            System.out.println("Numero invalido. Digite um numero de 1 a 7.");
        }

        scan.close();
    }
}
