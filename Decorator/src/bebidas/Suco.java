package bebidas;

public class Suco extends CoquetelDecorator {

    public Suco(Coquetel umCoquetel) {
        super(umCoquetel);
        setNome("Suco");
        setPreco(2.0);
    }

}
