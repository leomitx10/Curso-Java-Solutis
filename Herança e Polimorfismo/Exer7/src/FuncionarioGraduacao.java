public class FuncionarioGraduacao extends FuncionarioEnsinoMedio{
    private String universidade;

    public FuncionarioGraduacao(String nome, int codigoFuncional, String escola, String escolaEnsinoMedio, String universidade) {
        super(nome, codigoFuncional, escola, escolaEnsinoMedio);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public double getRendaTotal() {
        return super.getRendaTotal() * 2.00;
    }
}
