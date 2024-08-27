public class Main {
    public static void main(String[] args) {
        int totalFuncionarios = 10;
        Funcionario[] funcionarios = new Funcionario[totalFuncionarios];

        funcionarios[0] = new Funcionario("Gerente 1", 1, new Gerente());

        funcionarios[1] = new Funcionario("Supervisor 1", 2,  new Supervisor());
        funcionarios[2] = new Funcionario("Supervisor 2", 3,  new Supervisor());

        funcionarios[3] = new Funcionario("Vendedor 1", 4,  new Vendedor());
        funcionarios[4] = new Funcionario("Vendedor 2", 5,  new Vendedor());
        funcionarios[5] = new Funcionario("Vendedor 3", 6,  new Vendedor());
        funcionarios[6] = new Funcionario("Vendedor 4", 7,  new Vendedor());
        funcionarios[7] = new Funcionario("Vendedor 5", 8,  new Vendedor());
        funcionarios[8] = new Funcionario("Vendedor 6", 9,  new Vendedor());
        funcionarios[9] = new Funcionario("Vendedor 7", 10,  new Vendedor());

        double custoTotal = 0;
        double custoGerentes = 0;
        double custoSupervisores = 0;
        double custoVendedores = 0;

        for (Funcionario func : funcionarios) {
            double renda = func.calcularSalarioTotal();
            custoTotal += renda;

            if (func.getComissao() instanceof Gerente) {
                custoGerentes += renda;
            } else if (func.getComissao() instanceof Supervisor) {
                custoSupervisores += renda;
            } else if (func.getComissao() instanceof Vendedor) {
                custoVendedores += renda;
            }
        }

        System.out.println("Custo total da empresa: R$ " + custoTotal);
        System.out.println("Custo com Gerentes: R$ " + custoGerentes);
        System.out.println("Custo com Supervisores: R$ " + custoSupervisores);
        System.out.println("Custo com Vendedores: R$ " + custoVendedores);
    }
}
