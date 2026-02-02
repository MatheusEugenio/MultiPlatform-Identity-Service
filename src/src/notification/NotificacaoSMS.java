package notification;

import user.Usuario;

public class NotificacaoSMS implements INotificacao{
    @Override
    public String enviarNotificacao(Usuario destinatario, String mensagem) {
        StringBuilder mensagemSMS = new StringBuilder();

        if (destinatario == null){
            throw new IllegalStateException("Erro: o destinatário nulo!");
        }

        if(mensagem == null || mensagem.isEmpty()){
            throw new IllegalStateException("Erro: a mensagem não válida pois é nula!");
        }

        if(destinatario.getNumeroTelefone() == null || destinatario.getNumeroTelefone().isEmpty()){
            throw new IllegalStateException("Erro: o telefone do destinatário é nulo!");
        }

        mensagemSMS.append("Você recebeu um mensagem via SMS de "+ destinatario.getNome());
        mensagemSMS.append(" do número: "+destinatario.getEmail()+"\n");
        mensagemSMS.append("Mensagem: "+ mensagem+"\n");
        return mensagemSMS.toString();
    }
}
