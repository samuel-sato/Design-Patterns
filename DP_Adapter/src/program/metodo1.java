package program;

import Interfaces.InterfaceInconpativel;

public class metodo1 implements InterfaceInconpativel {

	@Override
	public boolean isNumero(String s, double num) {
		return s.chars().allMatch(Character::isDigit);
	}

}
