public class Cadeira {

    private static Cadeira instance = null;

    protected Cadeira() { }

    public static Cadeira Instance() {
        if (instance == null) {
            instance = new Cadeira();
        }
        return instance;
    }

}
