package Program;

import Interfaces.INotificador;

public class NotificadorRedesSociais extends NotificadorDecorado {

	public NotificadorRedesSociais(INotificador fonte) {
		super(fonte);
	}
	
	@Override
	public void enviarEmail() {
		super.enviarEmail();
	}
	
	@Override
	public void notificar() {
		super.notificar();
		this.eniarSMS();
	}
	
	private void eniarSMS() {
		System.out.println("SMS eviado com a mensagem: " + super.getMensagem());
	}

}
