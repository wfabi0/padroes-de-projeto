import bebidas.*;

public class Main {

    public static void main(String[] args) {

        Coquetel meuCoquetel = new Cachaca();
        System.out.println(
                meuCoquetel.getNome() + " = " + meuCoquetel.getPreco()
        );

        meuCoquetel = new Refrigerante(meuCoquetel);
        System.out.println(
                meuCoquetel.getNome() + " = " + meuCoquetel.getPreco()
        );

        Coquetel meuCoquetel2 = new Rum();
        System.out.println(
                meuCoquetel2.getNome() + " = " + meuCoquetel2.getPreco()
        );
        meuCoquetel2 = new Limao(meuCoquetel2);
        System.out.println(
                meuCoquetel2.getNome() + " = " + meuCoquetel2.getPreco()
        );

    }

}