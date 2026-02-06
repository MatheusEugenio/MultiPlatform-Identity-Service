package user;

public abstract class UsuarioFactory {

    public static Usuario criarAdmin(UsuarioAdmin.Builder builder) {
        return builder.build();
    }

    public static Usuario criarCliente(UsuarioCliente.Builder builder) {
        return builder.build();
    }
}
