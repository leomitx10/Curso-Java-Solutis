public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico{
    private String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escola, String escolaEnsinoMedio) {
        super(nome, codigoFuncional, escola);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }

    public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    @Override
    public double getRendaTotal() {
        return super.getRendaTotal() * 1.50;
    }
}
