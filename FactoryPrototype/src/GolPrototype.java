public class GolPrototype extends CarroPrototype {

    protected GolPrototype(GolPrototype golPrototype) {
        this.valorCompra = golPrototype.getValorCompra();
    }

    public GolPrototype() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Carro: Volkswagen Gol | Valor de Compra: R$ " + this.getValorCompra();
    }

    @Override
    public CarroPrototype clonar() {
        return new GolPrototype(this);
    }

}
