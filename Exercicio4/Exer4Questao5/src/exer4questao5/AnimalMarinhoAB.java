package exer4questao5;

/** * * @author Leandro */
public abstract class AnimalMarinhoAB extends AnimalAB {
    
    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }
    
    public abstract int nadar(int caminhoPercorrido);
}

