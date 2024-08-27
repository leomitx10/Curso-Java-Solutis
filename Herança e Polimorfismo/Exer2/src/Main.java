
public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Bob", 3);
        Animal cavalo = new Cavalo("Agro", 5);
        Animal preguica = new Preguica("Sid", 2);

        Animal[] animais = {cachorro, cavalo, preguica};

        for(int i = 0; i< animais.length; i++){
            animais[i].emitirSom();
        }
    }
}
