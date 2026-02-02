package notification;

import user.Usuario;

public class NotificacaoEmail implements INotificacao{
    @Override
    public String enviarNotificacao(Usuario destinatario, String mensagem) {
        StringBuilder mensagemEmail = new StringBuilder();

        if (!destinatario.getEmail().endsWith("@corpo.com") && !destinatario.getEmail().endsWith("@cliente.com")){
            throw new IllegalStateException("Erro: email do destinatario é inválido!");
        }

        mensagemEmail.append("Você recebeu um mensagem via email de "+ destinatario.getNome());
        mensagemEmail.append(" do email: "+destinatario.getEmail()+"\n");
        mensagemEmail.append("Mensagem: "+ mensagem+"\n");
        return mensagemEmail.toString();
    }
}
