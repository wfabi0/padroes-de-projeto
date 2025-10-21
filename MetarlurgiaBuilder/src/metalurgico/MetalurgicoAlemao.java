package metalurgico;

public class MetalurgicoAlemao extends MetalurgicoBuilder {

    @Override
    public void construirModelo() {
        carro.setModelo("BMW");
    }

    @Override
    public void construirMotor() {
        carro.setMotor("Motor de Alumínio");
    }

    @Override
    public void construirPneus() {
        carro.setPneus("Pneus de silicone");
    }

}
