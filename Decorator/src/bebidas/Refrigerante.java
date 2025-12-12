package bebidas;

public class Refrigerante extends CoquetelDecorator {

    public Refrigerante(Coquetel umCoquetel) {
        super(umCoquetel);
        setNome("Refrigerante");
        setPreco(1.0);
    }

}
