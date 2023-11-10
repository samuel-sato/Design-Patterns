package Model;

import Interface.ICheckbox;

public class CheckWindows implements ICheckbox {
	
	private boolean checked;
	
	public CheckWindows() {
		this.checked = false;
	}

	@Override
	public boolean check() {
		this.checked =  !this.checked;
		return this.checked;
	}

}
