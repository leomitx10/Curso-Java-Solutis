public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduacao(int codigoFuncional, String nome, String escola, String escolaEnsinoMedio, String universidade) {
        super(codigoFuncional, nome, escola, escolaEnsinoMedio);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}