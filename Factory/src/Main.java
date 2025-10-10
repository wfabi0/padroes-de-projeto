import carro.Carro;
import fabrica.Fabrica;
import fabrica.FabricaChevrolet;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new FabricaChevrolet();
        Carro c = fabrica.criarCarro();
        c.exibirInformacoes();
        c.entrarNoCarro();
        c.ligarCarro();
        c.furarPneu();
    }
}