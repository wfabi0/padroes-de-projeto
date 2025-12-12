package bebidas;

public class Acucar extends CoquetelDecorator {

    public Acucar(Coquetel umCoquetel) {
        super(umCoquetel);
        setNome("Açúcar");
        setPreco(6.0);
    }

}
