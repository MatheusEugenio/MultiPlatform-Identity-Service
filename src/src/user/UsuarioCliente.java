package user;
import user.constante.TipoDeUsuario;

public class UsuarioCliente extends Usuario.Builder{

    public UsuarioCliente(){
        this.tipoDeUsuario = TipoDeUsuario.CLIENTE;
    }

    @Override
    public void validarDadosDosDadosOpcionais() {
        if (!getEmail().endsWith("@cliente.com")){
            throw new IllegalStateException("Erro: o email "+getEmail()+" não é de cliente!");
        }

        if (getSenha() == null){
            throw new IllegalStateException("Erro: senha inválida!");
        }

        if(getNumeroTelefone() == null || getNumeroTelefone().isEmpty()){
            throw new IllegalStateException("Erro: o telefone é nulo!");
        }
    }
}
