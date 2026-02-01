package user;

import user.constante.Genero;
import user.constante.TipoDeUsuario;

public class Usuario {

    //atributos obrigatorios
    protected String nome;
    protected int idade;
    protected Genero sexo;
    protected TipoDeUsuario tipoDeUsuario;

    //atributos opcionais
    protected String email;
    protected String senha;

    public Usuario(Builder builder) {
        this.nome = builder.nome;
        this.idade = builder.idade;
        this.sexo = builder.sexo;
        this.tipoDeUsuario= builder.tipoDeUsuario;
        this.email = builder.email;
        this.senha = builder.senha;
    }

    public static abstract class Builder{

        //atributos obrigatorios
        private String nome;
        private int idade;
        private Genero sexo;
        private TipoDeUsuario tipoDeUsuario;

        //atributos opcionais
        private String email;
        private String senha;

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

        private void validacaoDosAtributos(){
            if (this.nome == null || this.idade <= 0 || this.sexo == null || this.tipoDeUsuario.equals(TipoDeUsuario.DEFAULT)){
                throw new IllegalStateException("Impossível cadastrar usuário, algum critério é inválido ou vazio!!");
            }
        }

        public abstract void validarDadosDoPerfil();

        public Usuario build(){
            validacaoDosAtributos();
            return new Usuario(this);
        }
    }



}
