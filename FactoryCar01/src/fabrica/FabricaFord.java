package fabrica;

import carro.CarroRetch;
import carro.CarroSedan;
import carro.modelo.Fiesta;
import carro.modelo.Focus;

public class FabricaFord implements FabricaCarro {
    @Override
    public CarroSedan criarCarroSedan() {
        return new Fiesta();
    }

    @Override
    public CarroRetch criarCarroRetch() {
        return new Focus();
    }
}
