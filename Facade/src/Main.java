public class Main {

    public static void main(String[] args) {

        System.out.println("Configurando subsistemas");
        SistemaFacade fachada = new SistemaFacade();
        fachada.inicializarSubsistemas();

        System.out.println("Utilizando subsistemas");
        fachada.renderizarImagem("imagem.png");
        fachada.reproduzirAudio("audio.m4a");
        fachada.lerInput();

    }

}