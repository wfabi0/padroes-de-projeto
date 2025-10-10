package fabrica;

import carro.Carro;
import carro.Celta;

public class FabricaChevrolet implements Fabrica {
    @Override
    public Carro criarCarro() {
        return new Celta();
    }
}
