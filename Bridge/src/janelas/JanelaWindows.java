package janelas;

public class JanelaWindows implements JanelaImplementada {

    @Override
    public void desenharJanela(String titulo) {
        System.out.println("Desenhando janela Windows: " + titulo);
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println("Desenhando botão Windows: " + titulo);
    }
}
