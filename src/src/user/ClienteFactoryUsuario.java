package user;

import user.constante.TipoDeUsuario;

public class ClienteFactoryUsuario implements FactoryUsuario {
    @Override
    public TipoDeUsuario getTipe() {
        return TipoDeUsuario.CLIENTE;
    }

    @Override
    public Usuario criar(Usuario.Builder<?> builder) {
        return builder.build();
    }
}
