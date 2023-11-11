package Program;

import Interfaces.INotificador;

public class NotificadorDecorado implements INotificador {
	
	protected INotificador notificador;
	
	public NotificadorDecorado(INotificador fonte) {
		this.notificador = fonte; 
	}

	@Override
	public void setMensagem(String mensagem) {
		notificador.setMensagem(mensagem);
		
	}

	@Override
	public void enviarEmail() {
		notificador.enviarEmail();		
	}

	@Override
	public void notificar() {
		this.enviarEmail();
	}

	@Override
	public String getMensagem() {
		return notificador.getMensagem();
	}

}
