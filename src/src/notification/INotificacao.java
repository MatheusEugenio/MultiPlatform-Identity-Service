package notification;

import user.Usuario;

public interface INotificacao {

    String tipoNotificacao();
    String enviarNotificacao(Usuario destinatario, String mensagem);

}
