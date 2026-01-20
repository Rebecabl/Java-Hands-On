import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class Main {

    public static void main(String[] args) {

        List<Produto> carrinho = new ArrayList<>();

        carrinho.add(new Produto("Mouse", 120.00));
        carrinho.add(new Produto("Teclado", 200.00));
        carrinho.add(new Produto("Headset", 350.00));

        double total = 0.0;

        for (Produto produto : carrinho) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
            total += produto.getPreco();
        }

        System.out.println("Total do carrinho: R$ " + total);
    }
}
