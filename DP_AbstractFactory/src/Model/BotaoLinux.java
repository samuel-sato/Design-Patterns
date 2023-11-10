package Model;

import Interface.IBotao;

public class BotaoLinux implements IBotao{
	
	private int Id;
	
	public BotaoLinux() {
		
	}
	
	@Override
	public String Clicar() {
		return "Botao Linux clicado";
	}

}
