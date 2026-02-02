package notification;

import user.Usuario;

public abstract class NotificationFactory {

    protected abstract INotificacao criarNotificacao(Usuario destinatario, String mensagem);

    public String processarNotificacao(Usuario destinatario, String mensagem){
        INotificacao notificacao = criarNotificacao(destinatario, mensagem);

        return notificacao.enviarNotificacao(destinatario, mensagem);
    }
}
