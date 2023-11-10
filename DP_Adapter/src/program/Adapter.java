package program;

import Interfaces.InterfaceAdaptada;
import Interfaces.InterfaceInconpativel;

public class Adapter implements InterfaceAdaptada {
	
	private InterfaceInconpativel classIncompativel;

	
	public Adapter(InterfaceInconpativel classeIncompativel) {
		this.classIncompativel = classeIncompativel;
	}


	@Override
	public boolean isNumero(String s) {
		return classIncompativel.isNumero(s, 0);
	}
}
