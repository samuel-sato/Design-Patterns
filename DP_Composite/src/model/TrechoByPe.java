package model;

import Interface.Trecho;

public class TrechoByPe implements Trecho{
	
	private String direcao;
	private double distancia;
	public TrechoByPe(String direcao, double distancia) {
		super();
		this.direcao = direcao;
		this.distancia = distancia;
	}
	@Override
	public void exibirCaminho() {
		System.out.println("By Pé");
		System.out.println("Distância percorrida " + this.distancia);
		
	}
	
	

}
