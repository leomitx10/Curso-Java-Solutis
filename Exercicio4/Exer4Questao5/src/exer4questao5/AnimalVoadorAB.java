package exer4questao5;

/** * * @author Leandro */
public abstract class AnimalVoadorAB extends AnimalAB {
    private int quantidadeAssas;
    private double envergaduraAssa; 

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeAssas, double envergaduraAssa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssa = envergaduraAssa;
    }
    
    public abstract int voar(int caminhoPercorrido);

    public int getQuantidadeAssas() {
        return quantidadeAssas;
    }

    public void setQuantidadeAssas(int quantidadeAssas) {
        this.quantidadeAssas = quantidadeAssas;
    }

    public double getEnvergaduraAssa() {
        return envergaduraAssa;
    }

    public void setEnvergaduraAssa(double envergaduraAssa) {
        this.envergaduraAssa = envergaduraAssa;
    }
}


