package user;

public class UsuarioAdmin extends Usuario.Builder{
    @Override
    public void validarDadosDosDadosOpcionais() {
        if (!getEmail().endsWith("@corpora.com")){
            throw new IllegalStateException("Erro: o email "+getEmail()+" não é corporativo!");
        }

        if (getSenha() == null){
            throw new IllegalStateException("Erro: senha inválida!");
        }

        if(getNumeroTelefone() == null || getNumeroTelefone().isEmpty()){
            throw new IllegalStateException("Erro: o telefone é nulo!");
        }
    }
}
