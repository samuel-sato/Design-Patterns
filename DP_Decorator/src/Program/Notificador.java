package Program;

import Interfaces.INotificador;

public class Notificador implements INotificador {
	
	private String mensagem;
	
	public Notificador() {
		
	}
	
	public Notificador(String mensagem ) {
		this.mensagem = mensagem;
	}
	

	@Override
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
		
	}

	@Override
	public void enviarEmail() {
		System.out.println("Emaisl enviado com a mensagem: " + this.mensagem);
		
	}

	@Override
	public void notificar() {
		
		
	}

	@Override
	public String getMensagem() {
		return this.mensagem;
	}

}
