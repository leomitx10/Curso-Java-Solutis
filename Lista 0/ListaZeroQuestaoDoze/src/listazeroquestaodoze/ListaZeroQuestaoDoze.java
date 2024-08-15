package listazeroquestaodoze;
/**** @author Leandro*/
public class ListaZeroQuestaoDoze {
    public static void main(String[] args) {

        System.out.println("Usando int:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultadoInt = i / 2; 
            System.out.println(i + "/2 = " + resultadoInt);
            }
        }

        System.out.println("\nUsando double:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                double resultadoDouble = i / 2.0; 
                System.out.println(i + "/2 = " + resultadoDouble);
            }
        }
    }  
}





