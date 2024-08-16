package listaumquestaodoze;

import java.util.Scanner;

/** ** @author Leandro*/
public class ListaUmQuestaoDoze {
    public static void main(String[] args) {
        double media = 0;
        int totalkm = 0;
        int Tlitros = 0;
        int contador = 1;
        int km, litros;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Digite os km rodados ou -1 para sair: ");
            km = scan.nextInt();

            if (km == -1){
                 break;
            }

            System.out.print("Consumo de combustivel em litros ou -1 para sair: ");
            litros = scan.nextInt();

            if (litros == -1) {
                break;
            }

            if (litros > 0) {
                totalkm += km;
                Tlitros += litros;
                
                System.out.printf("Media do carro %d: %.2f KM/Litro\n", contador++, (double) km / litros);
            } else {
                System.out.println("O valor de litros deve ser maior que 0.");
            }
        }

        if (Tlitros > 0) {
            media = (double) totalkm / Tlitros;
        }

        System.out.printf("\nTotal de combustivel gasto: %d litros\n", Tlitros);
        System.out.printf("Quilometros por litro: %.2f\n", media);
        System.out.printf("Total de quilometros rodados: %d\n", totalkm);

        scan.close();
    }
}
