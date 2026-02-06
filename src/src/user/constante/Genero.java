package user.constante;

public enum Genero {

    MASCULINO ("M"),
    FEMININO("F");

    private String sx;
    Genero(String sx) {
        this.sx = sx;
    }

    public String getSx() {
        return sx;
    }
}
