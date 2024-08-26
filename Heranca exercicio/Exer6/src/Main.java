//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("João", "12345678", "Rua A", 2000.0, 0.1,
                101, 50000.0, 5.0);

        v1.setNome("Bernado");
        v1.setTelefone("4235 2365");
        v1.setEndereco("Luziania - GO");
        v1.setSalarioBase(1800);
        v1.setImposto(0.12);
        v1.setCodigoSetor(102);
        v1.setValorVendas(40000);
        v1.setComissao(0.5);

        System.out.println("Nome: " + v1.getNome());
        System.out.println("Telefone: " + v1.getTelefone());
        System.out.println("Endereco: " + v1.getEndereco());
        System.out.println("Codigo do Setor: " + v1.getCodigoSetor());
        System.out.println("Salario Base: " + v1.getSalarioBase());
        System.out.println("Valor das Vendas: " + v1.getValorVendas());
        System.out.println("Comissao: " + v1.getComissao());
        System.out.println("Salario com Comissao: " + v1.calcularSalario());
    }
}