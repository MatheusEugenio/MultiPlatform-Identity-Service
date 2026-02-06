package config;

public class AppConfig {

    private String tipoPlataforma;

    private AppConfig() {
        this.tipoPlataforma = "WEB";
    }

    // CONFIG GLOBAL ÚNICA = SINGLETON
    public static final class Holder{
        public static final AppConfig INSTANCE = new AppConfig();
    }

    public static AppConfig getInstance(){
        return Holder.INSTANCE;
    }

    public String getTipoPlataforma() {
        return tipoPlataforma;
    }
}
