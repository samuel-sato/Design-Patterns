package Program;

public class Main {
	public static void main(String[] args) {
		
		String msn = "Olá mundo";
		String msn1 = "Hello World";
		
		NotificadorDecorado notificadorDecorado = new NotificadorRedesSociais(new Notificador(msn));
		
		notificadorDecorado.setMensagem(msn1);
		notificadorDecorado.notificar();
	}

}
