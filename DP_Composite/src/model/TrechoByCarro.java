package model;

import Interface.Trecho;

public class TrechoByCarro implements Trecho{
	
	private String direcao;
	private double distancia;
	
	public TrechoByCarro(String direcao, double distancia) {
		this.direcao = direcao;
		this.distancia = distancia;
	}



	@Override
	public void exibirCaminho() {
		System.out.println("By Carro");
		System.out.println("Distacia de " + this.distancia);
	}

}
