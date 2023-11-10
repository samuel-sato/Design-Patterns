package Model;

import Interface.ICheckbox;

public class CheckLinux implements ICheckbox {
	
	private boolean checked;
	
	public CheckLinux() {
		this.checked = false;
	}

	@Override
	public boolean check() {
		this.checked =  !this.checked;
		return this.checked;
	}

}
