import janelas.*;

public class Main {

    public static void main(String[] args) {

        JanelaAbstrata jan = new JanelaDialogo();
        jan.setJanela(new JanelaWindows());
        jan.desenhar();

        jan = new JanelaAviso();
        jan.setJanela(new JanelaWindows());
        jan.desenhar();

        jan = new JanelaDialogo();
        jan.setJanela(new JanelaLinux());
        jan.desenhar();

        jan = new JanelaAviso();
        jan.setJanela(new JanelaLinux());
        jan.desenhar();

    }

}