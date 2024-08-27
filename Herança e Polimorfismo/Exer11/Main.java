package src.ListaHerancaPolimorfismo.Questao11;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new Gerente("Pedro", 1134, 5000.00);

        funcionarios[1] = new Supervisor("Matheus", 4578, 3000.00);
        funcionarios[2] = new Supervisor("Tiago", 9799, 3200.00);

        funcionarios[3] = new Vendedor("Enzo", 2911, 2000.00);
        funcionarios[4] = new Vendedor("Fernando", 2801, 2100.00);
        funcionarios[5] = new Vendedor("Gabriel", 3162, 2200.00);
        funcionarios[6] = new Vendedor("Juliano", 5273, 2300.00);
        funcionarios[7] = new Vendedor("Mario", 4324, 2400.00);
        funcionarios[8] = new Vendedor("Paulo", 2485, 2500.00);
        funcionarios[9] = new Vendedor("Heitor", 2516, 2600.00);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
