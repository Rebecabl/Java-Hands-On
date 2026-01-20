import java.util.ArrayList;
import java.util.List;

import model.Funcionario;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Ana", 3500));
        funcionarios.add(new Funcionario("Carlos", 4200));
        funcionarios.add(new Funcionario("Mariana", 5000));

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: R$ " + funcionario.getSalario());
            System.out.println("----------------------");
        }
    }
}
