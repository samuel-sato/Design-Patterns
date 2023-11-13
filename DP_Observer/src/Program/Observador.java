package Program;

import Interfaces.EventListener;

public class Observador implements EventListener {

	private String  nome;
	
	public Observador(String nomeObservador) {
		this.nome = nomeObservador;
	}
	
	@Override
	public void update(String obj) {
		System.out.println("Objeto " + obj + "atualizado!");
		System.out.println(this.nome + " notificado"); 
	}

}
