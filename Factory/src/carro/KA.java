package carro;

public class KA implements Carro {

    public KA() {
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("KA\nMarca: Ford\nPneu: FireStone\nMotor: AP");
    }

    @Override
    public void entrarNoCarro() {
        System.out.println("BRUM!");
    }

    @Override
    public void ligarCarro() {
        System.out.println("AP Ligado");
    }

    @Override
    public void furarPneu() {
        System.out.println("TCHEEE!\n\nPNEU GAUCHO");
    }
}
