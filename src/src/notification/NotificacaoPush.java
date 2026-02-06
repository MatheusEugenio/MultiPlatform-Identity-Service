package notification;

import user.Usuario;

public class NotificacaoPush implements INotificacao {
    @Override
    public String tipoNotificacao() {
        return "PUSH";
    }

    @Override
    public String enviarNotificacao(Usuario destinatario, String mensagem) {
        StringBuilder mensagemPUSH = new StringBuilder();


        mensagemPUSH.append("VOCÊ RECEBEU UMA MENSAGEM!!");
        mensagemPUSH.append("\n");
        mensagemPUSH.append("\nMENSAGEM: "+ mensagem);
        return mensagemPUSH.toString();
    }
}
