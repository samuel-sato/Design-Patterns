package factories;

import Interface.Veiculo;
import Model.Carro;

public class CarroFectory extends BaseFactory {

	@Override
	public Veiculo FabricarVeiculo() {
		return new Carro();
	}

	@Override
	public Veiculo FabricarVeiculoComNome(String nome) {
		return new Carro(nome, "Prata");
	}

}
