public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String telefone, String endereco, double salarioBase, double imposto, int codigoSetor, double valorProducao, double comissao) {
        super(nome, telefone, endereco, salarioBase, imposto, codigoSetor);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioComComissao = getSalarioBase() + (valorProducao * comissao);
        return salarioComComissao - (salarioComComissao * getImposto());
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
