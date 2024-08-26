public class Main {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", "3655 2135", "Rua A, 123", 7000, 0.20, 3);

        empregado.setNome("Leandro");
        empregado.setTelefone("3656 2136");
        empregado.setEndereco("Rua B, 1234");
        empregado.setSalarioBase(6000);
        empregado.setImposto(0.15);
        empregado.setCodigoSetor(4);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Codigo do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salario Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto());
        System.out.println("Salario Liquido: " + empregado.calcularSalario());
    }
}