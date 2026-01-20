import model.ContaBancaria;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Ana");

        conta.depositar(1000);
        conta.sacar(300);
        conta.sacar(800);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}
