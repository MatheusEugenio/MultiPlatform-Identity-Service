package user;

public class UsuarioCliente extends Usuario{

    private UsuarioCliente(Builder builderc) {
        super(builderc);
    }

    public static class Builder extends Usuario.Builder<Builder>{

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public UsuarioCliente build() {
            validarObrigatorios();
            return new UsuarioCliente(this);
        }
    }

}
