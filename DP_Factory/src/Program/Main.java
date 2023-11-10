package Program;

import Interface.Veiculo;
import Model.Carro;
import factories.BaseFactory;
import factories.CarroFectory;

public class Main {
	public static void main(String args[]) {
		
		//Uma fábrica define uma interface para criar objetos, mas deixa as subclasses decidirem qual classe instanciar
		// Nesse caso é possivel instanciar bicicleta e carro;
		// A fabrica pode retornar diferentes classes que impletemant a interface veiculo, dependendo do argumento do metodo;
		
		BaseFactory factory = new CarroFectory();
		
		//Criou carro 
		Veiculo c1 = factory.FabricarVeiculo();
		c1.Acelerar();
		
		// criou o carro, acelerou e freou; 
		factory.acelerarVeiculo();
	}

}
