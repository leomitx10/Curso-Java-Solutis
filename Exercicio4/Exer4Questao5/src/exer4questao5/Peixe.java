package exer4questao5;
/** * * @author Leandro*/

public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
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

    @Override
    public int nadar(int caminhoPercorrido) {
        setCaminhoPercorrido(getCaminhoPercorrido() + caminhoPercorrido);
        return getCaminhoPercorrido();
    }
}
