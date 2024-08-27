public class Funcionario {
    private String nome;
    private int codigoFuncional;

    public Funcionario(int codigoFuncional, String nome) {
        this.codigoFuncional = codigoFuncional;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }
}
