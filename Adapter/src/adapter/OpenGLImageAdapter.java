package adapter;

import api.OpenGLImage;
import intefaces.ImagemTarget;

public class OpenGLImageAdapter extends OpenGLImage implements ImagemTarget {

    @Override
    public void carregarImagem(String nomeArquivo) {
        glCarregarImagem(nomeArquivo);
    }

    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
        glDesenharImagem(posX, posY);
    }

}
