public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + getNome() + " faz au au.");
    }

    public void correr() {
        System.out.println(getNome() + " correu.");
    }
}
