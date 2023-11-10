package factories;

import Interface.Veiculo;
import Model.Bicicleta;

public class BicicletaFectory extends BaseFactory {

	@Override
	public Veiculo FabricarVeiculo() {
		return new Bicicleta();
	}

	@Override
	public Veiculo FabricarVeiculoComNome(String nome) {
		return new Bicicleta(nome, false);
	}

}
