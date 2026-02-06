package notification;

import user.Usuario;

public class NotificacaoEmail implements INotificacao{
    @Override
    public String tipoNotificacao() {
        return "EMAIL";
    }

    @Override
    public String enviarNotificacao(Usuario destinatario, String mensagem) {
        StringBuilder mensagemEmail = new StringBuilder();

        mensagemEmail.append("VOCÊ RECEBEU UMA MENSAGEM VIA "+tipoNotificacao()+" DE "+ destinatario.getEmail());
        mensagemEmail.append("\n\nMENSAGEM: "+ mensagem+"\n");
        return mensagemEmail.toString();
    }
}
