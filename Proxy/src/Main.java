public class Main {

    public static void main(String[] args) {

        System.out.println("#### Hacker acessando ####\n");
        BancoUsuarios banco = new BancoProxy("hacker", "senha");
        System.out.println(banco.getUsuariosConectados());
        System.out.println(banco.getUsuariosConectados());

        System.out.println("\n#### Administrador acessando ####\n");
        banco = new BancoProxy("admin", "admin");
        System.out.println(banco.getNumeroDeUsuarios());
        System.out.println(banco.getUsuariosConectados());

    }

}