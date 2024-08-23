package exer4questao5;

/**** @author Leandro */
public class Main {
    public static void main(String[] args) {
        Cachorro ca1 = new Cachorro("Rex", "Cão", 5, "Canil", 0.75, 25.0, 4);
        ca1.setNome("Bob");
        ca1.comer(5);
        ca1.dormir(5);
        ca1.caminhar(5);
        ca1.moverse(5);
        ca1.setAltura(1.1);
        
        System.out.println("Nome: " + ca1.getNome());
        System.out.println(ca1.getNome() +" comeu "+ ca1.getQuantidadeComida()+ " kg de comida.");
        System.out.println(ca1.getNome() +" dormiu "+ ca1.getHorasDormidas() + " horas.");
        System.out.println(ca1.getNome() +" percorreu " + ca1.getCaminhoPercorrido() + " metros.");
    }
}
