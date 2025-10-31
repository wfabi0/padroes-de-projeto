public class Main {
    public static void main(String[] args) {

        Cadeira cadeira1 = Cadeira.Instance();
        Cadeira cadeira2 = Cadeira.Instance();

        if (cadeira1 == cadeira2) {
            System.out.println("As duas cadeiras são a mesma instância.");
        } else {
            System.out.println("As duas cadeiras são instâncias diferentes.");
        }

    }
}