package fabrica;

import carro.Carro;
import carro.Gol;

public class FabricaVW implements Fabrica {

    @Override
    public Carro criarCarro() {
        return new Gol();
    }
}
