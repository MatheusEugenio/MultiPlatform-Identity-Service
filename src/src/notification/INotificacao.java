package notification;

import user.Usuario;

public interface INotificacao {
    void enviarNotificacao(Usuario destinatario, String mensagem);
}
