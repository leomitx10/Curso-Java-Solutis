//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Administrador adm1 = new Administrador("Leandro", "3655 2698", "Gama - DF",
                4500, 0.15, 2, 650);

        adm1.setNome("Gabriel");
        adm1.setTelefone("3644 2698");
        adm1.setEndereco("Salvador - BA");
        adm1.setSalarioBase(820);
        adm1.setImposto(0.12);
        adm1.setCodigoSetor(2);
        adm1.setAjudaDeCusto(200.50);

        System.out.println("Nome: " + adm1.getNome());
        System.out.println("Telefone: " + adm1.getTelefone());
        System.out.println("Endereço: " + adm1.getEndereco());
        System.out.println("Salario Base: " + adm1.getSalarioBase());
        System.out.println("Imposto: " + adm1.getImposto());
        System.out.println("Codigo do Setor: " + adm1.getCodigoSetor());
        System.out.println("Ajuda de Custo: " + adm1.getAjudaDeCusto());
        System.out.println("Salario Liquido: " + adm1.calcularSalario());
    }
}