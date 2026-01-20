import model.Funcionario;
import model.FuncionarioCLT;
import model.FuncionarioPJ;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1 =
                new FuncionarioCLT("Ana", 3000, 500);

        Funcionario funcionario2 =
                new FuncionarioPJ("Carlos", 80, 160);

        System.out.println("Funcionário: " + funcionario1.getNome());
        System.out.println("Salário: R$ " + funcionario1.calcularSalario());

        System.out.println();

        System.out.println("Funcionário: " + funcionario2.getNome());
        System.out.println("Salário: R$ " + funcionario2.calcularSalario());
    }
}
