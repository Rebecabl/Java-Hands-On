package model;

public class FuncionarioCLT extends Funcionario {

    private double salarioMensal;
    private double beneficio;

    public FuncionarioCLT(String nome, double salarioMensal, double beneficio) {
        super(nome);
        this.salarioMensal = salarioMensal;
        this.beneficio = beneficio;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal + beneficio;
    }
}
