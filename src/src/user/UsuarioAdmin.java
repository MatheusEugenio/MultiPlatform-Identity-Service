package user;

public class UsuarioAdmin extends Usuario{

    private UsuarioAdmin(Builder builder) {
        super(builder);
    }

    public static class Builder extends Usuario.Builder<Builder> {

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public UsuarioAdmin build() {
            validarObrigatorios();
            return new UsuarioAdmin(this);
        }
    }

}
