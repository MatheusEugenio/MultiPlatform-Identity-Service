package notification;

import user.Usuario;

public class NotificacaoSMS implements INotificacao{
    @Override
    public String tipoNotificacao() {
        return "SMS";
    }

    @Override
    public String enviarNotificacao(Usuario destinatario, String mensagem) {
        StringBuilder mensagemSMS = new StringBuilder();

        mensagemSMS.append("VOCÊ RECEBEU UM MENSAGEM VIA "+tipoNotificacao()+" DE "+ destinatario.getNumeroTelefone());
        mensagemSMS.append(" -> "+destinatario.getNome());
        mensagemSMS.append("\n\nMENSAGEM: "+ mensagem+"\n");
        return mensagemSMS.toString();
    }
}
