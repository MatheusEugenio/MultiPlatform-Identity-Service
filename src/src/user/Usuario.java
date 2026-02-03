package user;
import user.constante.Genero;
import user.constante.TipoDeUsuario;

public class Usuario {

    //atributos obrigatorios
    private String nome;
    private int idade;
    private Genero sexo;
    private TipoDeUsuario tipoDeUsuario;

    //atributos opcionais
    private String email;
    private String senha;
    private String numeroTelefone;

    public Usuario(Builder builder) {
        this.nome = builder.nome;
        this.idade = builder.idade;
        this.sexo = builder.sexo;
        this.tipoDeUsuario = builder.tipoDeUsuario;
        this.email = builder.email;
        this.senha = builder.senha;
        this.numeroTelefone = builder.numeroTelefone;
    }

    public String getNome() {return nome;}
    public int getIdade() {return idade;}
    public Genero getSexo() {return sexo;}
    public TipoDeUsuario getTipoDeUsuario() {return tipoDeUsuario;}
    public String getEmail() {return email;}
    public String getSenha() {return senha;}
    public String getNumeroTelefone() {return numeroTelefone;}

    public static abstract class Builder{

        //atributos obrigatorios
        protected String nome;
        protected int idade;
        protected Genero sexo;
        protected TipoDeUsuario tipoDeUsuario;

        //atributos opcionais
        protected String email;
        protected String senha;
        protected String numeroTelefone;

        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }

        public Builder idade(int idade){
            this.idade = idade;
            return this;
        }

        public Builder sexo(Genero genero){
            this.sexo = genero;
            return this;
        }

        public Builder tipoDeUsuario(TipoDeUsuario tipo){
            this.tipoDeUsuario = tipo;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder senha(String senha){
            this.senha = senha;
            return this;
        }

        public Builder numeroTelefone(String numeroTelefone){
            this.numeroTelefone = numeroTelefone;
            return this;
        }

        protected void validacaoDosDadosObrigatorios(){
            if (this.nome == null || this.idade <= 0 || this.sexo == null || this.tipoDeUsuario.equals(TipoDeUsuario.DEFAULT)){
                throw new IllegalStateException("Impossível cadastrar usuário, algum critério é inválido ou vazio!!");
            }
        }

        protected abstract void validarDadosDosDadosOpcionais();

        public Usuario build(){
            validacaoDosDadosObrigatorios();
            validarDadosDosDadosOpcionais();
            return new Usuario(this);
        }

        public String getEmail() {return email;}
        public String getSenha() {return senha;}
        public String getNumeroTelefone() {return numeroTelefone;}
    }

}
