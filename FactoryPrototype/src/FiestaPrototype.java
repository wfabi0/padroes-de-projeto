public class FiestaPrototype extends CarroPrototype {

    protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
        this.valorCompra = fiestaPrototype.getValorCompra();
    }

    public FiestaPrototype() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Carro: Ford Fiesta | Valor de Compra: R$ " + this.getValorCompra();
    }

    @Override
    public CarroPrototype clonar() {
        return new FiestaPrototype(this);
    }
}
