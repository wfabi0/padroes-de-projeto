package bebidas;

public class Coquetel {

    private String nome;

    public Coquetel() {
    }

    public Coquetel(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    private Double preco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
