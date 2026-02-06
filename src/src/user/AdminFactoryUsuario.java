package user;

import user.constante.TipoDeUsuario;

public class AdminFactoryUsuario implements FactoryUsuario {

    @Override
    public TipoDeUsuario getTipe() {
        return TipoDeUsuario.ADMIN;
    }

    @Override
    public Usuario criar(Usuario.Builder<?> builder) {
        return builder.build();
    }
}
