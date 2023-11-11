package Interfaces;

public interface INotificador {
	
	public void setMensagem(String mensagem);
	public String getMensagem();
	public void enviarEmail();
	public void notificar();

}
