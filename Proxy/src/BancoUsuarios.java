public class BancoUsuarios {

    private final int quantidadeDeUsuarios;
    private final int usuariosConectados;

    public BancoUsuarios() {
        quantidadeDeUsuarios = (int) (Math.random() * 100);
        usuariosConectados = (int) (Math.random() * 10);
    }

    public String getNumeroDeUsuarios() {
        return "Total de usuários: " + quantidadeDeUsuarios;
    }

    public String getUsuariosConectados() {
        return "Usuários conectados: " + usuariosConectados;
    }

}
