package janelas;

public class JanelaAviso extends JanelaAbstrata {

    @Override
    public void desenhar() {
        desenharJanela("Janela de Aviso");
        desenharBotao("OK");
    }

}
