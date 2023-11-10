package Model;

import Interface.Veiculo;

public class Carro implements Veiculo {
	
	private String nome;
	private String cor;
	
	public Carro() {
		
	}

	public Carro(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}

	@Override
	public void Acelerar() {
		System.out.println("Carro acelerando");		
	}

	@Override
	public void Frear() {
		System.out.println("Carro freiando");
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
