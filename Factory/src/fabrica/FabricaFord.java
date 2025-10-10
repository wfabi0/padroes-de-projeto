package fabrica;

import carro.Carro;
import carro.KA;

public class FabricaFord implements Fabrica {
    @Override
    public Carro criarCarro() {
        return new KA();
    }
}
