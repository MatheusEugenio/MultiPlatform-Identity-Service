package UI;

import UI.componentesUI.Botao;
import UI.componentesUI.Comportamento;
import UI.componentesUI.Input;
import UI.implementacoes.*;

public class UIWebFactory implements UIFactory{
    @Override
    public Botao criarBotao() {
        return new BotaoWeb();
    }

    @Override
    public Input criarInput() {
        return new InputWeb();
    }

    @Override
    public Comportamento criarComportamento() {
        return new ComportamentoWeb();
    }
}
