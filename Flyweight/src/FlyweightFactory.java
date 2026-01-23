import java.util.ArrayList;

public class FlyweightFactory {

    protected ArrayList<SpriteFlyweight> flyweights;

    public static enum Sprites {
        JOGADOR, INIMIGO_1, INIMIGO_2, INIMIGO_3, CENARIO_1, CENARIO_2
    }

    public FlyweightFactory() {
        flyweights = new ArrayList<SpriteFlyweight>();
        flyweights.add(new Sprite("jogador.png"));
        flyweights.add(new Sprite("inimigo1.png"));
        flyweights.add(new Sprite("inimigo2.png"));
        flyweights.add(new Sprite("inimigo3.png"));
        flyweights.add(new Sprite("cenario1.png"));
        flyweights.add(new Sprite("cenario2.png"));
    }

    public SpriteFlyweight getFlyweight(Sprites jogador) {
        return switch (jogador) {
            case JOGADOR -> flyweights.get(0);
            case INIMIGO_1 -> flyweights.get(1);
            case INIMIGO_2 -> flyweights.get(2);
            case INIMIGO_3 -> flyweights.get(3);
            case CENARIO_1 -> flyweights.get(4);
            case CENARIO_2 -> flyweights.get(5);
            default -> null;
        };
    }

}
