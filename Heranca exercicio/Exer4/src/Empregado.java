public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, String telefone, String endereco, double salarioBase, double imposto, int codigoSetor) {
        super(nome, telefone, endereco);
        this.salarioBase = salarioBase;
        this.imposto = imposto;
        this.codigoSetor = codigoSetor;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto);
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
