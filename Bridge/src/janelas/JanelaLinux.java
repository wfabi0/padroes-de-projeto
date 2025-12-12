package janelas;

public class JanelaLinux implements JanelaImplementada {

    @Override
    public void desenharJanela(String titulo) {
        System.out.println("Desenhando janela Linux: " + titulo);
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println("Desenhando botão Linux: " + titulo);
    }

}
