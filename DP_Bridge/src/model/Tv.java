package model;

import interfaces.Dispositivo;

public class Tv implements Dispositivo{
	
	private double volume = 10.0;
	private boolean power = false;

	@Override
	public double getVolume() {
		return this.volume;
	}

	@Override
	public void setVolume() {
		this.volume += 10;
	}

	@Override
	public boolean power() {
		this.power = !this.power;
		return this.power;
	}

}
