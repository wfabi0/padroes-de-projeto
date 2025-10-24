package fabrica;

import carro.CarroRetch;
import carro.CarroSedan;
import carro.modelo.Palio;
import carro.modelo.Siena;

public class FabricaFiat implements FabricaCarro {
    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroRetch criarCarroRetch() {
        return new Palio();
    }
}
