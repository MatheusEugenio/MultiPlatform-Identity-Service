package user;
import user.constante.Genero;

public abstract class Usuario {

    //atributos obrigatorios
    protected String nome;
    protected int idade;
    protected Genero sexo;

    //atributos opcionais
    protected String email;
    protected String senha;
    protected String numeroTelefone;

    public Usuario(Builder<?> builder) {
        this.nome = builder.nome;
        this.idade = builder.idade;
        this.sexo = builder.sexo;
        this.email = builder.email;
        this.senha = builder.senha;
        this.numeroTelefone = builder.numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Genero getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public static abstract class Builder<T extends Builder<T>> {

        protected String nome;
        protected int idade;
        protected Genero sexo;

        protected String email;
        protected String senha;
        protected String numeroTelefone;

        protected abstract T self();

        public T nome(String nome) {
            this.nome = nome;
            return self();
        }

        public T idade(int idade) {
            this.idade = idade;
            return self();
        }

        public T sexo(Genero sexo) {
            this.sexo = sexo;
            return self();
        }

        public T email(String email) {
            this.email = email;
            return self();
        }

        protected void validarObrigatorios() {
            if (nome == null || idade <= 0 || sexo == null) {
                throw new IllegalStateException("Dados obrigatórios inválidos");
            }
        }

        protected abstract Usuario build();

    }
}
