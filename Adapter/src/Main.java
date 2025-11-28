import adapter.OpenGLImageAdapter;
import adapter.SDLImagemAdapter;
import intefaces.ImagemTarget;

public class Main {

    public static void main(String[] args) {
        ImagemTarget imagemTarget = new SDLImagemAdapter();
        imagemTarget.carregarImagem("teste.png");
        imagemTarget.desenharImagem(0, 0, 10, 10);

        imagemTarget = new OpenGLImageAdapter();
        imagemTarget.carregarImagem("teste.png");
        imagemTarget.desenharImagem(0, 0, 10, 10);
    }

}