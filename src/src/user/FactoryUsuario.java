package user;

import user.constante.TipoDeUsuario;

public interface FactoryUsuario {
    TipoDeUsuario getTipe();
    Usuario criar(Usuario.Builder<?> builder);
}
