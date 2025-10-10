package carro;

public class Gol implements Carro {
    @Override
    public void exibirInformacoes() {
        System.out.println("Gol\nMarca: Volkswagen\nPneu: GoodYear\nMotor: CHT");
    }

    @Override
    public void entrarNoCarro() {
        System.out.println("TREM!");
    }

    @Override
    public void ligarCarro() {
        System.out.println("CHT ligado");
    }

    @Override
    public void furarPneu() {
        System.out.println("Chash!");
    }
}
