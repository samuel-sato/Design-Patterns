package Model;

import Enum.TipoCasa;

public class Casa {
	
	private TipoCasa tipocasa;
	private Telhado telhado;
	private Parede parede;
	private Piso piso;
	
	public Casa(TipoCasa tipocasa, Telhado telhado, Parede parede, Piso piso) {
		this.tipocasa = tipocasa;
		this.telhado = telhado;
		this.parede = parede;
		this.piso = piso;
	}

	@Override
	public String toString() {
		return "Casa [tipocasa=" + tipocasa.toString() + ", telhado=" + telhado.toString() + ", parede=" + parede.toString()+ ", piso=" + piso.toString() + "]";
	}
	
}
