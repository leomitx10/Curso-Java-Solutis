package exer4questao5;

/** * * @author Leandro */
public class Elefante extends AnimalTerrestreAB {
    
    public Elefante(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
    }
    
    @Override
    public int caminhar(int caminhoPercorrido) {
        setCaminhoPercorrido(getCaminhoPercorrido() + caminhoPercorrido);
        return getCaminhoPercorrido();
    }
    
    @Override
    public int comer(int quantidadeComida) {
        setQuantidadeComida(getQuantidadeComida() + quantidadeComida);
        return getQuantidadeComida();
    }

    @Override
    public int moverse(int caminhoPercorrido) {
        setCaminhoPercorrido(getCaminhoPercorrido() + caminhoPercorrido);
        return getCaminhoPercorrido();
    }

    @Override
    public int dormir(int horasDormidas) {
        setHorasDormidas(getHorasDormidas() + horasDormidas);
        return getHorasDormidas();
    }    
}
