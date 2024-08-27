public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico{
    private String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(int codigoFuncional, String nome, String escola, String escolaEnsinoMedio) {
        super(codigoFuncional, nome, escola);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }

    public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }
}
