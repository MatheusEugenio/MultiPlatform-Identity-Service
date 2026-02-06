package notification;

import user.Usuario;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    protected INotificacao criarNotificacao(Usuario destinatario, String mensagem) {

        if (mensagem == null || mensagem.isEmpty()){
            throw new IllegalStateException("Erro: a mensagem não válida pois é nula!");
        }

        return new NotificacaoPush();
    }
}
