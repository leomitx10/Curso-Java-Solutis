
public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new FuncionarioEnsinoBasico("Leandro",
                1, "Escola Basica 1");

        funcionarios[1] = new FuncionarioEnsinoBasico("Gabriel",
                2, "Escola Basica 2");

        funcionarios[2] = new FuncionarioEnsinoBasico("Pedro",
                3, "Escola Basica 3");

        funcionarios[3] = new FuncionarioEnsinoBasico("Matheus",
                4, "Escola Basica 4");

        funcionarios[4] = new FuncionarioEnsinoMedio("Arthur",
                5, "Escola Basica 5", "Escola Media 1");

        funcionarios[5] = new FuncionarioEnsinoMedio("Jonas",
                6, "Escola Basica 6", "Escola Media 2");

        funcionarios[6] = new FuncionarioEnsinoMedio("Gustavo",
                7, "Escola Basica 7", "Escola Media 3");

        funcionarios[7] = new FuncionarioEnsinoMedio("Flavio",
                8, "Escola Basica 8", "Escola Media 4");

        funcionarios[8] = new FuncionarioGraduacao("Oscar",
                9, "Escola Basica 9", "Escola Media 5", "Universidade 1");

        funcionarios[9] = new FuncionarioGraduacao("Douglas",
                10, "Escola Basica 10", "Escola Media 6", "Universidade 2");

        double custoEnsinoMedio = 0;
        double custoEnsinoSuperior = 0;
        double custoTotal = 0;
        double custoEnsinoBasico = 0;

        for (Funcionario func : funcionarios) {
            double renda = func.getRendaTotal();
            custoTotal += renda;

            if (func instanceof FuncionarioGraduacao) {
                custoEnsinoSuperior += renda;
            } else if (func instanceof FuncionarioEnsinoMedio) {
                custoEnsinoMedio += renda;
            } else if (func instanceof FuncionarioEnsinoBasico) {
                custoEnsinoBasico += renda;
            }
        }

        System.out.println("Custo total da empresa: R$ " + custoTotal);
        System.out.println("Custo com funcionarios de nivel superior: R$ " + custoEnsinoSuperior);
        System.out.println("Custo com funcionarios de ensino medio: R$ " + custoEnsinoMedio);
        System.out.println("Custo com funcionarios de ensino basico: R$ " + custoEnsinoBasico);
    }
}
