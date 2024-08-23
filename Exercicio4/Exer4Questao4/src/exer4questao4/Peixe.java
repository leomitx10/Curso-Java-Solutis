package exer4questao4;

/** * * @author Leandro */
public class Peixe extends AnimalMarinhoAB{
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
