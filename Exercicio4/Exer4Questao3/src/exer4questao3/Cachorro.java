package exer4questao3;

/** * * @author Leandro */
public class Cachorro extends AnimalAB{
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
