package Factory;

import Interface.IBotao;
import Interface.ICheckbox;
import Interface.IGuiFactory;
import Model.BotaoLinux;
import Model.CheckLinux;


public class FactoryWindows implements IGuiFactory{

	public FactoryWindows() {
		
	}
	@Override
	public IBotao criarbotao() {
		return new BotaoLinux();
	}

	@Override
	public ICheckbox criarCheckbox() {
		return new CheckLinux();
	}
}
