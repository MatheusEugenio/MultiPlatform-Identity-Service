package notification;

import user.Usuario;

public class NotificacaoSMS implements INotificacao{
    @Override
    public String enviarNotificacao(Usuario destinatario, String mensagem) {
        StringBuilder mensagemSMS = new StringBuilder();

        mensagemSMS.append("Você recebeu um mensagem via SMS de "+ destinatario.getNome());
        mensagemSMS.append(" do número: "+destinatario.getEmail()+"\n");
        mensagemSMS.append("Mensagem: "+ mensagem+"\n");
        return mensagemSMS.toString();
    }
}
