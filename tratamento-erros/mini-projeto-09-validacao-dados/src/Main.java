import model.Usuario;
import model.IdadeInvalidaException;

public class Main {

    public static void main(String[] args) {

        try {
            Usuario usuario = new Usuario("Ana", 25);
            System.out.println(usuario.getNome() + " - " + usuario.getIdade());

            usuario.setIdade(-5);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
