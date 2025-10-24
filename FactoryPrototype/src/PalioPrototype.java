public class PalioPrototype extends CarroPrototype {

    protected PalioPrototype(PalioPrototype palioPrototype) {
        this.valorCompra = palioPrototype.getValorCompra();
    }

    public PalioPrototype() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Carro: Fiat Palio | Valor de Compra: R$ " + this.getValorCompra();
    }

    @Override
    public CarroPrototype clonar() {
        return new PalioPrototype(this);
    }

}
