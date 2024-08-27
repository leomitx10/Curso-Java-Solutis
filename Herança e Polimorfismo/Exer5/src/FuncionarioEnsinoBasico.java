public class FuncionarioEnsinoBasico  extends Funcionario{
    private String escola;

    public FuncionarioEnsinoBasico(int codigoFuncional, String nome, String escola) {
        super(codigoFuncional, nome);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}
