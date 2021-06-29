package notificacao;

import org.springframework.stereotype.Component;

import entidades.Cliente;

//@Component
public class NotificadorEmail{

	public NotificadorEmail() {
		System.out.println("NotificadorEmail chamdo.");
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atrav�s do email %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
