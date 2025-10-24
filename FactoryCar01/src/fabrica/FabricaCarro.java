package fabrica;

import carro.CarroRetch;
import carro.CarroSedan;

public interface FabricaCarro {
    CarroSedan criarCarroSedan();
    CarroRetch criarCarroRetch();
}
