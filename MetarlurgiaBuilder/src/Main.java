import fabrica.Fabrica;
import metalurgico.MetalurgicoAlemao;
import metalurgico.MetalurgicoBrasileiro;
import metalurgico.MetalurgicoBuilder;

public class Main {

    public static void main(String[] args) {

        MetalurgicoBuilder metalurgicoBrasileiro = new MetalurgicoBrasileiro();
        Fabrica fabricaBrasileira = new Fabrica(metalurgicoBrasileiro);
        fabricaBrasileira.construirCarro();
        System.out.println(fabricaBrasileira.obterCarro());

        MetalurgicoBuilder metalurgicoAlemao = new MetalurgicoAlemao();
        Fabrica fabricaAlema = new Fabrica(metalurgicoAlemao);
        fabricaAlema.construirCarro();
        System.out.println(fabricaAlema.obterCarro());

    }

}