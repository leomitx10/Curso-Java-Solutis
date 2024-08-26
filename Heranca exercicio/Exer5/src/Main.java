//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Corrigi a chamada para incluir o valor da produção e a comissão
        Operario op1 = new Operario("Pedro", "2425 - 3539", "Gama - DF", 1000,
                0.10, 1, 5000, 0.05);

        op1.setNome("Matheus");
        op1.setTelefone("2354 - 4861");
        op1.setEndereco("Luziania - GO");
        op1.setSalarioBase(2000);
        op1.setImposto(0.12);
        op1.setCodigoSetor(2);
        op1.setValorProducao(4000);
        op1.setComissao(0.06);

        System.out.println("Nome: " + op1.getNome());
        System.out.println("Telefone: " + op1.getTelefone());
        System.out.println("Endereço: " + op1.getEndereco());
        System.out.println("Salario Base: " + op1.getSalarioBase());
        System.out.println("Imposto: " + op1.getImposto());
        System.out.println("Codigo do Setor: " + op1.getCodigoSetor());
        System.out.println("Comissao: " + op1.getComissao());
        System.out.println("Valor Producao: " + op1.getValorProducao());
        System.out.println("Salario Liquido: " + op1.calcularSalario());
    }
}