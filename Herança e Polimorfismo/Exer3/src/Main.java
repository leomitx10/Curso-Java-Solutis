//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Bob", 3);
        Animal cavalo = new Cavalo("Agro", 5);
        Animal preguica = new Preguica("Sid", 2);
        Veterinario Vetleandro = new Veterinario();

        Animal[] animais = {cachorro, cavalo, preguica};

        for(int i = 0; i<animais.length; i++){
            Vetleandro.examinar(animais[i]);
        }
    }
}