package Model;

import Interface.IBotao;

public class BotaoWindows implements IBotao{
	
	private int Id;
	
	public BotaoWindows() {
		
	}
	
	@Override
	public String Clicar() {
		return "Botao Windows clicado";
	}

}
