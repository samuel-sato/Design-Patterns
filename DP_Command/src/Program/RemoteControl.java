package Program;

import Interfaces.ICommand;

public class RemoteControl {
	
	ICommand slot;
	
	public RemoteControl() {
		
	}
	
	public void setCommand(ICommand slot) {
		this.slot = slot;
	}
	
	public void pressButton() {
		this.slot.Execute();
	}

}
