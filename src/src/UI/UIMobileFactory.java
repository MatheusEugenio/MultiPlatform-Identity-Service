package UI;

import UI.componentesUI.Botao;
import UI.componentesUI.Comportamento;
import UI.componentesUI.Input;
import UI.implementacoes.BotaoMobile;
import UI.implementacoes.ComportamentoMobile;
import UI.implementacoes.InputMobile;

public class UIMobileFactory implements UIFactory{
    @Override
    public Botao criarBotao() {
        return new BotaoMobile();
    }

    @Override
    public Input criarInput() {
        return new InputMobile();
    }

    @Override
    public Comportamento criarComportamento() {
        return new ComportamentoMobile();
    }
}
