
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", "Gama - DF", "6123 4582");
        Fornecedor f1 = new Fornecedor("Matheus", "Sobradinho - DF", "4521 9682",
                444,100);

        p1.setNome("Leandro");
        p1.setEndereco("Brasilia - DF");
        p1.setTelefone("6452 3541");

        f1.setNome("Pedro");
        f1.setEndereco("Goiania - GO");
        f1.setTelefone("6578 4562");
        f1.setValorCredito(556);
        f1.getValorCredito();
        f1.setValorDivida(212);
        f1.getValorDivida();

        System.out.println("Dados da Pessoa:\n" +
                "Nome: " + p1.getNome() + "\n" +
                "Endereco: " + p1.getEndereco() + "\n" +
                "Telefone: " + p1.getTelefone() + "\n");

        System.out.println("Dados do Fornecedor: \n" +
                "Nome: " + f1.getNome() + "\n" +
                "Endereco: " + f1.getEndereco() + "\n" +
                "Telefone: " + f1.getTelefone() + "\n" +
                "Credito: " + f1.getValorCredito() + "\n" +
                "Divida: " + f1.getValorDivida() + "\n" +
                "Saldo: " + f1.obterSaldo() + "\n");

    }
}