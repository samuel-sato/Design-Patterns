package model;

import java.util.ArrayList;
import java.util.List;

import Interface.Trecho;

public class Caminho implements Trecho{
	
	private List<Trecho> trechos = new ArrayList<Trecho>();
	
	public void addTrecho(Trecho trecho) {
		this.trechos.add(trecho);
	}
	
	public void removeTrecho(Trecho trecho) {
		this.trechos.remove(trecho);
	}

	@Override
	public void exibirCaminho() {
		for(Trecho trecho: this.trechos) {
			trecho.exibirCaminho();
		}
		
	}

}
