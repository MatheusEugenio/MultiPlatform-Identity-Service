package notification;

import user.Usuario;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    protected INotificacao criarNotificacao(Usuario destinatario, String mensagem) {

        if (destinatario == null){
            throw new IllegalStateException("Erro: o destinatário nulo!");
        }

        if(mensagem == null || mensagem.isEmpty()){
            throw new IllegalStateException("Erro: a mensagem não válida pois é nula!");
        }

        return new NotificacaoSMS();
    }
}
