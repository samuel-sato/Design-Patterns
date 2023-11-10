package model;

import interfaces.Dispositivo;

public class ControleRemoto {
	
	protected Dispositivo dispositivo;
	
	public ControleRemoto() {
		
	};
	
	public void aumetarVolume() {
		this.dispositivo.setVolume();
	}

}
