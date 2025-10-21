package metalurgico;

import carro.Carro;

public abstract class MetalurgicoBuilder {

    protected Carro carro;

    public MetalurgicoBuilder() {
        carro = new Carro();
    }

    public Carro getCarro() {
        return carro;
    }

    public abstract void construirModelo();
    public abstract void construirMotor();
    public abstract void construirPneus();

}
