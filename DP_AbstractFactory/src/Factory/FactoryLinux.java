package Factory;

import Interface.IBotao;
import Interface.ICheckbox;
import Interface.IGuiFactory;
import Model.BotaoWindows;
import Model.CheckWindows;

public class FactoryLinux implements IGuiFactory{
	
	public FactoryLinux() {
		
	}

	@Override
	public IBotao criarbotao() {
		return new BotaoWindows();
	}

	@Override
	public ICheckbox criarCheckbox() {
		return new CheckWindows();
	}



}
