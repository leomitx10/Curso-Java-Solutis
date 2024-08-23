package exer4questao4;

/** * * @author Leandro */
public abstract class AnimalAB implements AnimalIF{
    private int quantidadeComida;
    private int caminhoPercorrido;
    private int horasDormidas;
    
    @Override
    public abstract int comer(int quantidadeComida);

    @Override
    public abstract int moverse(int caminhoPercorrido);

    @Override
    public abstract int dormir(int horasDormidas);

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public int getCaminhoPercorrido() {
        return caminhoPercorrido;
    }

    public void setCaminhoPercorrido(int caminhoPercorrido) {
        this.caminhoPercorrido = caminhoPercorrido;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }
}
