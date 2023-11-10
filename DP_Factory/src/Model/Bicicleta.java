package Model;

import Interface.Veiculo;

public class Bicicleta implements Veiculo {
	
	private String marca;
	private boolean speed;
	
	public Bicicleta() {
		
	}
	

	public Bicicleta(String marca, boolean speed) {
		this.marca = marca;
		this.speed = speed;
	}

	@Override
	public void Acelerar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Frear() {
		// TODO Auto-generated method stub
		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public boolean isSpeed() {
		return speed;
	}


	public void setSpeed(boolean speed) {
		this.speed = speed;
	}
}
