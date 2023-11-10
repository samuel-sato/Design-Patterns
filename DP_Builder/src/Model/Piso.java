package Model;

import Enum.TipoPiso;

public class Piso {
	private TipoPiso tipoPiso;
	private boolean possuiEscoamento;
	
	public Piso() {
		
	}

	public Piso(TipoPiso tipoPiso, boolean possuiEscoamento) {
		this.tipoPiso = tipoPiso;
		this.possuiEscoamento = possuiEscoamento;
	}

	public TipoPiso getTipoPiso() {
		return tipoPiso;
	}

	public void setTipoPiso(TipoPiso tipoPiso) {
		this.tipoPiso = tipoPiso;
	}

	public boolean isPossuiEscoamento() {
		return possuiEscoamento;
	}

	public void setPossuiEscoamento(boolean possuiEscoamento) {
		this.possuiEscoamento = possuiEscoamento;
	}
}
