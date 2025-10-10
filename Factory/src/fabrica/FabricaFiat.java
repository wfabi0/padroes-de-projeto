package fabrica;

import carro.Carro;
import carro.Fiat;

public class FabricaFiat implements Fabrica {
    @Override
    public Carro criarCarro() {
        return new Fiat();
    }
}
