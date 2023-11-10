package factories;

import Interface.Veiculo;

public abstract class BaseFactory {

	
	public abstract Veiculo FabricarVeiculo();
	public abstract Veiculo FabricarVeiculoComNome(String nome);
	public void acelerarVeiculo() {
		this.FabricarVeiculo().Acelerar();
		this.FabricarVeiculo().Frear();
	}
	
}
