package metalurgico;

import motor.Motor;
import motor.MotorDeAluminio;

public class MetalurgicaAlemao implements Metalurgica {
    @Override
    public Motor criarMotor() {
        return new MotorDeAluminio();
    }
}
