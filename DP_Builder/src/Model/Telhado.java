package Model;

import Enum.TipoMaterial;

public class Telhado {
	
	private TipoMaterial material;
	private boolean possuiRachadura;
	private boolean possibilitaLage;
	
	public Telhado() {
		
	}

	public Telhado(TipoMaterial material, boolean possuiRachadura, boolean possibilitaLage) {
		this.material = material;
		this.possuiRachadura = possuiRachadura;
		this.possibilitaLage = possibilitaLage;
	}

	public TipoMaterial getMaterial() {
		return material;
	}

	public void setMaterial(TipoMaterial material) {
		this.material = material;
	}

	public boolean isPossuiRachadura() {
		return possuiRachadura;
	}

	public void setPossuiRachadura(boolean possuiRachadura) {
		this.possuiRachadura = possuiRachadura;
	}

	public boolean isPossibilitaLage() {
		return possibilitaLage;
	}

	public void setPossibilitaLage(boolean possibilitaLage) {
		this.possibilitaLage = possibilitaLage;
	}
}
