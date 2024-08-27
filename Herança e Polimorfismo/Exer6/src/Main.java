//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FuncionarioGraduacao funcionarioGraduacao = new FuncionarioGraduacao("leandro", 5,
                "escola1","escola2" , "unb");

        System.out.println(funcionarioGraduacao.getRendaTotal());
    }
}