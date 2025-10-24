import carro.CarroRetch;
import carro.CarroSedan;
import fabrica.FabricaCarro;
import fabrica.FabricaFiat;

public class Main {
    public static void main(String[] args) {

        FabricaCarro fabricaFiat = new FabricaFiat();
        CarroSedan sedanFiat = fabricaFiat.criarCarroSedan();
        CarroRetch retchFiat = fabricaFiat.criarCarroRetch();
        sedanFiat.exibirInfoSedan();
        retchFiat.exibirInfoRetch();

        FabricaCarro fabricaFord = new fabrica.FabricaFord();
        CarroSedan sedanFord = fabricaFord.criarCarroSedan();
        CarroRetch retchFord = fabricaFord.criarCarroRetch();
        sedanFord.exibirInfoSedan();
        retchFord.exibirInfoRetch();

    }
}