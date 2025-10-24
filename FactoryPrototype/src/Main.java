public class Main {
    public static void main(String[] args) {
        PalioPrototype palioPrototype = new PalioPrototype();

        CarroPrototype palioNovo = palioPrototype.clonar();
        palioNovo.setValorCompra(27900.0);
        CarroPrototype palioUsado = palioPrototype.clonar();
        palioUsado.setValorCompra(21000.0);

        System.out.println(palioNovo.exibirInfo());
        System.out.println(palioUsado.exibirInfo());


        FiestaPrototype fiestaPrototype = new FiestaPrototype();

        CarroPrototype fiestaNovo = fiestaPrototype.clonar();
        fiestaNovo.setValorCompra(32000.0);
        CarroPrototype fiestaUsado = fiestaPrototype.clonar();
        fiestaUsado.setValorCompra(25000.0);

        System.out.println(fiestaNovo.exibirInfo());
        System.out.println(fiestaUsado.exibirInfo());


        GolPrototype golPrototype = new GolPrototype();

        CarroPrototype golNovo = golPrototype.clonar();
        golNovo.setValorCompra(28000.0);
        CarroPrototype golUsado = golPrototype.clonar();
        golUsado.setValorCompra(22000.0);

        System.out.println(golNovo.exibirInfo());
        System.out.println(golUsado.exibirInfo());
    }
}