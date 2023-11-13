package Program;

import Interfaces.ICommand;

public class LightOnCommand implements ICommand {
	
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void Execute() {
		this.light.turnOn();
	}

}
