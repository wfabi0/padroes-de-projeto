package metalurgico;

import motor.Motor;
import motor.MotorEletrico;

public class MetalurgicaJapones implements Metalurgica {
    @Override
    public Motor criarMotor() {
        return new MotorEletrico();
    }
}
