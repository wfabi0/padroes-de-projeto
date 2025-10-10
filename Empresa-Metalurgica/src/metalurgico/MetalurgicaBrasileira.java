package metalurgico;

import motor.Motor;
import motor.MotorDeAco;

public class MetalurgicaBrasileira implements Metalurgica {
    @Override
    public Motor criarMotor() {
        return new MotorDeAco();
    }
}
