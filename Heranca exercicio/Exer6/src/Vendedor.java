public class Vendedor  extends Empregado{
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String telefone, String endereco, double salarioBase, double imposto, int codigoSetor, double valorVendas, double comissao) {
        super(nome, telefone, endereco, salarioBase, imposto, codigoSetor);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioComComissao = getSalarioBase() + (getValorVendas() * (getComissao() / 100));
        return salarioComComissao - (salarioComComissao * getImposto());
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
