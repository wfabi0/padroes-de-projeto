package carro;

public class Fiat implements Carro {
    @Override
    public void exibirInformacoes() {
        System.out.println("Palio\nMarca:Fiat");
    }

    @Override
    public void entrarNoCarro() {
        System.out.println("Entrei no palinho malvado");
    }

    @Override
    public void ligarCarro() {
        System.out.println("Já vai fazer maldadedes?");
    }

    @Override
    public void furarPneu() {
        System.out.println("Eita, molhou a malvadeza");
    }
}
