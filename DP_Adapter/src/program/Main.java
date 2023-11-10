package program;

import Interfaces.InterfaceInconpativel;

public class Main {
	public static void main(String args[]) {
		
		// A lógica é expor uma interface para que possar executar requisições.
		// A ideia é  adapatar uma interface transformando-a em outra tudo no adapter.
		
		InterfaceInconpativel m1 = new metodo1();
		InterfaceInconpativel m2 = new metodo2();
		
		Adapter adapter = new Adapter(m1);
		//Adapter adapter = new Adapter(m2);
		
		
		System.out.println(adapter.isNumero("2"));
	}

}
