package Interfaces;

import Enum.TipoCasa;
import Model.Parede;
import Model.Piso;
import Model.Telhado;

public interface IBuilder {
	
	void setTipoCasa(TipoCasa tipocasa);
	void setTelhado(Telhado telhado);
	void setParede(Parede parede);
	void setPiso(Piso piso);

}
