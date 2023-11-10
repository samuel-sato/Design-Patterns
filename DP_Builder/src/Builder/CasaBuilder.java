package Builder;

import Enum.TipoCasa;
import Interfaces.IBuilder;
import Model.Casa;
import Model.Parede;
import Model.Piso;
import Model.Telhado;

public class CasaBuilder implements IBuilder {
	
	private TipoCasa tipoCasa;
	private Telhado telhado;
	private Parede parede;
	private Piso piso;
	

	@Override
	public void setTipoCasa(TipoCasa tipocasa) {
		this.tipoCasa = tipocasa;
	}

	@Override
	public void setTelhado(Telhado telhado) {
		this.telhado = telhado;
	}

	@Override
	public void setParede(Parede parede) {
		this.parede = parede;
	}

	@Override
	public void setPiso(Piso piso) {
		this.piso = piso;
	}
	
	public Casa getCasa() {
		return new Casa(tipoCasa, telhado, parede, piso);
	}

}
