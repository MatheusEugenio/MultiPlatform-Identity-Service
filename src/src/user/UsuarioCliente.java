package user;

public class UsuarioCliente extends Usuario.Builder{
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
