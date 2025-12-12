package bebidas;

public class Limao extends CoquetelDecorator {

    public Limao(Coquetel umCoquetel) {
        super(umCoquetel);
        setNome("Limão");
        setPreco(0.5);
    }

}
