package notification;

import user.Usuario;

public interface INotificacao {
    String enviarNotificacao(Usuario destinatario, String mensagem);
}
