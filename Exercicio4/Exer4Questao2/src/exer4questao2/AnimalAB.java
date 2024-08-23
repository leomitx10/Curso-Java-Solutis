package exer4questao2;

/** * * @author Leandro */
public abstract class AnimalAB implements AnimalIF{
    @Override
    public abstract int comer(int quantidadeComida);

    @Override
    public abstract int moverse(int caminhoPercorrido);

    @Override
    public abstract int dormir(int horasDormidas);
}
