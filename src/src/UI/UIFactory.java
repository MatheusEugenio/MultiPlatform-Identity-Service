package UI;

import UI.componentesUI.Botao;
import UI.componentesUI.Comportamento;
import UI.componentesUI.Input;

public interface UIFactory {
    Botao criarBotao();
    Input criarInput();
    Comportamento criarComportamento();
}
