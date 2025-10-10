import metalurgico.MetalurgicaAlemao;
import metalurgico.MetalurgicaBrasileira;
import metalurgico.Metalurgica;
import metalurgico.MetalurgicaJapones;
import motor.Motor;

public class Main {
    public static void main(String[] args) {

        Metalurgica metalurgicoAlemao = new MetalurgicaAlemao();
        Metalurgica metalurgicoBrasileira = new MetalurgicaBrasileira();
        Metalurgica metalurgicaJaponesa = new MetalurgicaJapones();

        Motor motorAlemao = metalurgicoAlemao.criarMotor();
        Motor motorBrasileiro = metalurgicoBrasileira.criarMotor();
        Motor motorJapones = metalurgicaJaponesa.criarMotor();

        motorAlemao.exibirInfo();
        motorBrasileiro.exibirInfo();
        motorJapones.exibirInfo();

    }
}