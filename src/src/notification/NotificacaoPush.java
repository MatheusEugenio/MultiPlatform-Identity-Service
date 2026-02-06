package notification;

import user.Usuario;

public class NotificacaoPush implements INotificacao {
    @Override
    public String enviarNotificacao(Usuario destinatario, String mensagem) {
        StringBuilder mensagemPUSH = new StringBuilder();


        mensagemPUSH.append("Você recebeu uma mensagem Push!");
        mensagemPUSH.append("\n");
        mensagemPUSH.append("Mensagem: "+ mensagem);
        return mensagemPUSH.toString();
    }
}
