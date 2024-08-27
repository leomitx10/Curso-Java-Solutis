public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Funcionario("Leandro", 1,  new Gerente());
        Funcionario supervisor = new Funcionario("Ana", 2,  new Supervisor());
        Funcionario vendedor = new Funcionario("Pedro", 3,  new Vendedor());

        System.out.println(gerente.getNome() + " - Salário Gerente: R$ " + gerente.calcularSalarioTotal());
        System.out.println(supervisor.getNome() + " - Salário Supervisor: R$ " + supervisor.calcularSalarioTotal());
        System.out.println(vendedor.getNome() + " - Salário Vendedor: R$ " + vendedor.calcularSalarioTotal());
    }
}