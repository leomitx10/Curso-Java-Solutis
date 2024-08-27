public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + getNome() + " faz barulho.");
    }

    public void subirNaArvore() {
        System.out.println(getNome() + " subiu na arvore.");
    }
}
