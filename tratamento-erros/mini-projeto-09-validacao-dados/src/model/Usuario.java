package model;

public class Usuario {

    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 120) {
            throw new IdadeInvalidaException("Idade inválida: " + idade);
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
