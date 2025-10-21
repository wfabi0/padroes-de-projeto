package metalurgico;

public class MetalurgicoBrasileiro extends MetalurgicoBuilder {

    @Override
    public void construirModelo() {
        carro.setModelo("Gol");
    }

    @Override
    public void construirMotor() {
        carro.setMotor("Motor de Aço");
    }

    @Override
    public void construirPneus() {
        carro.setPneus("Pneus de borracha natural");
    }

}
