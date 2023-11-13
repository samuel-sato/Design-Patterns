package Program;

import Interfaces.EventListener;

public class Objeto {
	
	EventListener observador; //pode ter uma lista de observadores
	private String nome;
	
	public Objeto(String nome) {
		this.nome = nome;
	}
	
	public void addObservador(EventListener observador) {
		this.observador = observador;
	}
	
	// add metodo para remover observador;
	
	public void notificar() {
		observador.update(nome);
	}
	

}
