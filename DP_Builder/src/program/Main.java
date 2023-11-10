package program;

import Builder.CasaBuilder;
import Enum.TipoCasa;
import Model.Casa;
import Model.Parede;
import Model.Piso;
import Model.Telhado;

public class Main {
	
	public static void main(String args[]) {
		CasaBuilder builder = new CasaBuilder();
		
		builder.setTipoCasa(TipoCasa.APARTAMENTO);
		builder.setTelhado(new Telhado());
		builder.setParede(new Parede());
		builder.setPiso(new Piso());
		
		Casa casa = builder.getCasa();
		
		System.out.println(casa.toString());
		
	}

}
