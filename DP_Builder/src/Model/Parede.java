package Model;

import Enum.TipoMaterial;

public class Parede {
	
	private TipoMaterial material;
	private boolean torta;
	private boolean possuiRachadura;
	private boolean possuiJanela;
	
	public Parede () {
		
	}

	public Parede(TipoMaterial material, boolean torta, boolean possuiRachadura, boolean possuiJanela) {
		this.material = material;
		this.torta = torta;
		this.possuiRachadura = possuiRachadura;
		this.possuiJanela = possuiJanela;
	}

	public TipoMaterial getMaterial() {
		return material;
	}

	public void setMaterial(TipoMaterial material) {
		this.material = material;
	}

	public boolean isTorta() {
		return torta;
	}

	public void setTorta(boolean torta) {
		this.torta = torta;
	}

	public boolean isPossuiRachadura() {
		return possuiRachadura;
	}

	public void setPossuiRachadura(boolean possuiRachadura) {
		this.possuiRachadura = possuiRachadura;
	}
	
	public boolean isPossuiJanela() {
		return possuiJanela;
	}

	public void setPossuiJanela(boolean possuiJanela) {
		this.possuiJanela = possuiJanela;
	}
}
