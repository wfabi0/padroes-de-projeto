package bebidas;

public class CoquetelDecorator extends Coquetel {

    Coquetel coquetel;

    public CoquetelDecorator(Coquetel umCoquetel) {
        this.coquetel = umCoquetel;
    }

    @Override
    public String getNome() {
        return coquetel.getNome() + " " + super.getNome();
    }

    @Override
    public Double getPreco() {
        return coquetel.getPreco() + super.getPreco();
    }

}
