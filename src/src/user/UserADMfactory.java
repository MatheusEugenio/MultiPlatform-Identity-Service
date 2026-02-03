package user;

public class UserADMfactory extends UsuarioFactory{

    @Override
    public Usuario criar() {
        return new UsuarioAdmin().build();
    }
}
