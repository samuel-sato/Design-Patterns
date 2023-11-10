package program;

import Interfaces.InterfaceInconpativel;

public class metodo2 implements InterfaceInconpativel {

	@Override
	public boolean isNumero(String s, double num) {
		return (s != null && s.matches("[0-9]+"));
	}

}
