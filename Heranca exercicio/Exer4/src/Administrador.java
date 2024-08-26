public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(String nome, String telefone, String endereco, double salarioBase, double imposto, int codigoSetor, double ajudaDeCusto) {
        super(nome, telefone, endereco, salarioBase, imposto, codigoSetor);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        double salarioLiquido = getSalarioBase() - (getSalarioBase() * getImposto());
        return salarioLiquido + ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
