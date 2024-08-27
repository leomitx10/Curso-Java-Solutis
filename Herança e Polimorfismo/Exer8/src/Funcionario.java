public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double rendaBasica;
    private Comissao comissao;

    public Funcionario(String nome, int codigoFuncional,  Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaBasica = 1000;
        this.comissao = comissao;
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

    public double getRendaBasica() {
        return rendaBasica;
    }

    public void setRendaBasica(double rendaBasica) {
        this.rendaBasica = rendaBasica;
    }

    public double getRendaTotal() {
        return rendaBasica;
    }

    public double calcularSalarioTotal() {
        return rendaBasica + comissao.getAdicional();
    }
}