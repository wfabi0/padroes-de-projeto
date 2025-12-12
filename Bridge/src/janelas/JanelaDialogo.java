package janelas;

public class JanelaDialogo extends JanelaAbstrata {

    @Override
    public void desenhar() {
        desenharJanela("Janela de Diálogo");
        desenharBotao("OK");
    }

}
