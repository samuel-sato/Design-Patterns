package Program;

public class Main {
	
	public static void main(String args[]) {
		
		Light light = new Light();
		
		LightOnCommand lightCommand = new LightOnCommand(light);
		
		RemoteControl remoteControl = new RemoteControl();
		
		remoteControl.setCommand(lightCommand);

		remoteControl.pressButton();
	}

	
}
