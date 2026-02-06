package aplication;

import UI.UIFactory;
import UI.UIMobileFactory;
import UI.UIWebFactory;
import UI.componentesUI.Botao;
import UI.componentesUI.Comportamento;
import UI.componentesUI.Input;
import config.AppConfig;
import notification.EmailNotificationFactory;
import notification.NotificationFactory;
import notification.PushNotificationFactory;
import notification.SMSNotificationFactory;
import user.*;
import user.constante.Genero;
import user.constante.TipoDeUsuario;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        AppConfig config = AppConfig.getInstance();

        ////////////////////////////////// UI

        UIFactory uiFactory = switch (config.getTipoPlataforma().toUpperCase()){
            case "WEB" -> new UIWebFactory();
            case "MOBILE" -> new UIMobileFactory();
            default -> throw new IllegalArgumentException("Erro: a plaforma é incompatível ou não existe!");
        };

        Botao botao = uiFactory.criarBotao();
        botao.usarBotao();

        Input input = uiFactory.criarInput();
        input.usarInput();

        Comportamento comportamento = uiFactory.criarComportamento();
        comportamento.usarComportamento();

        ////////////////////////////////// USUÁRIO

        TipoDeUsuario userType = TipoDeUsuario.CLIENTE;

        FactoryUsuario factoryUser = switch (userType){
            case ADMIN -> new AdminFactoryUsuario();
            case CLIENTE -> new ClienteFactoryUsuario();
            default -> throw new IllegalArgumentException("Erro: Tipo de cliente não definido!");
        };

        Set<FactoryUsuario> setFactory = new HashSet<>();
        setFactory.add(factoryUser);

        UsuarioFactoryResolver resolver = new UsuarioFactoryResolver(setFactory);

        Usuario user = resolver.criar( userType, new UsuarioCliente.Builder()
                .nome("Pedro Paralamas")
                .idade(40)
                .sexo(Genero.MASCULINO)
                .email("pedroparalama12@cliente.com")
                .senha("1234")
                .numeroDeTelefone("8799752345"));

        System.out.println("Usuário "+ user.getNome()+" foi criado com sucesso!");

        ////////////////////////////////// NOTIFICAÇÃO

        NotificationFactory notificationFactory;

        if (config.getTipoPlataforma().equalsIgnoreCase("WEB")){
            notificationFactory = new EmailNotificationFactory();
        }else if (config.getTipoPlataforma().equalsIgnoreCase("MOBILE")){
            notificationFactory = new SMSNotificationFactory();
        }else {
            notificationFactory = new PushNotificationFactory();
        }

        String mensagem = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. \nLorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";

        String notificacao = notificationFactory.processarNotificacao(user,mensagem);
        System.out.println("===============================");
        System.out.println("\n"+notificacao);
        System.out.println("===============================");
    }
}