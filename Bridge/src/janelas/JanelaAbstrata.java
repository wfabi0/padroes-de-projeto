package janelas;

public class JanelaAbstrata {

    protected JanelaImplementada janela;

    public void desenharJanela(String titulo) {
        janela.desenharJanela(titulo);
    }

    public void desenharBotao(String titulo) {
        janela.desenharBotao(titulo);
    }

    public void desenhar() {

    }

    public JanelaImplementada getJanela() {
        return janela;
    }

    public void setJanela(JanelaImplementada janela) {
        this.janela = janela;
    }

}
