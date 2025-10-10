package carro;

public class Celta implements Carro {

    @Override
    public void exibirInformacoes() {
        System.out.println("Celta\nMarca: Chevrolet");
    }

    @Override
    public void entrarNoCarro() {
        System.out.println("Bem vindo moreno");
    }

    @Override
    public void ligarCarro() {
        System.out.println("Vamos para onde moreno");
    }

    @Override
    public void furarPneu() {
        System.out.println("Furou o pneu moreno");
    }
}
