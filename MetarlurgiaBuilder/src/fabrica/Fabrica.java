package fabrica;

import carro.Carro;
import metalurgico.MetalurgicoBuilder;

public class Fabrica {

    private MetalurgicoBuilder builder;

    public Fabrica(MetalurgicoBuilder builder) {
        this.builder = builder;
    }

    public void construirCarro() {
        builder.construirModelo();
        builder.construirMotor();
        builder.construirPneus();
    }

    public Carro obterCarro() {
        return builder.getCarro();
    }


}
