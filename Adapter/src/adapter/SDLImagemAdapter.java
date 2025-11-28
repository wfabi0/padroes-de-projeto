package adapter;

import api.SDL_Surface;
import intefaces.ImagemTarget;

public class SDLImagemAdapter extends SDL_Surface implements ImagemTarget {

    @Override
    public void carregarImagem(String nomeArquivo) {
        SDL_CarregarSurface(nomeArquivo);
    }

    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
        SDL_DesenharSurface(largura, altura, posX, posY);
    }

}
