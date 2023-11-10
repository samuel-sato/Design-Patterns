package model;

import interfaces.Dispositivo;

public class Radio implements Dispositivo {
	
	private double volume = 10.0;
	private int canal = 1;
	private boolean power = false;

	@Override
	public double getVolume() {
		return this.volume;
	}

	@Override
	public void setVolume() {
		this.volume += 10;
		System.out.println("Volumen " + this.getVolume());
	}

	public double getCanal() {
		return this.canal;
	}

	public void setCanalMais() {
		this.canal += 1;
		System.out.println("Canal " + this.getCanal());
	}

	@Override
	public boolean power() {
		this.power = !this.power;
		return this.power;
	}
}
