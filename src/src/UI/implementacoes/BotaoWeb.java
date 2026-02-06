package UI.implementacoes;

import UI.componentesUI.Botao;

public class BotaoWeb implements Botao {
    @Override
    public void usarBotao() {
        System.out.println("Usando botão WEB!");
    }
}
