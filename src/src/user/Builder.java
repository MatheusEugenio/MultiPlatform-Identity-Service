//package user;
//
//import user.constante.Genero;
//
//public static abstract class Builder <T extends Builder<T>> {
//
//    protected String nome;
//    protected int idade;
//    protected Genero sexo;
//
//    protected String email;
//    protected String senha;
//    protected String numeroTelefone;
//
//    protected abstract T self();
//
//    public T nome(String nome) {
//        this.nome = nome;
//        return self();
//    }
//
//    public T idade(int idade) {
//        this.idade = idade;
//        return self();
//    }
//
//    public T sexo(Genero sexo) {
//        this.sexo = sexo;
//        return self();
//    }
//
//    public T email(String email) {
//        this.email = email;
//        return self();
//    }
//
//    protected void validarObrigatorios() {
//        if (nome == null || idade <= 0 || sexo == null) {
//            throw new IllegalStateException("Dados obrigatórios inválidos");
//        }
//    }
//
//    protected abstract Usuario build();
//}
