package Program;

public class Main {
	
	public static void main(String args []) {
		Objeto obj = new Objeto("obj1");
		
		Observador observador1 = new Observador("Obs1");
		Observador observador2 = new Observador("Obs2");
		
		obj.addObservador(observador1);
		
		obj.notificar();
		
	}

}
