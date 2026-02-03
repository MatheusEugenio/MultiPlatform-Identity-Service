package user;

public class UserCLIENTfactory extends UsuarioFactory{

    @Override
    public Usuario criar() {
        return new UsuarioCliente().build();
    }
}
