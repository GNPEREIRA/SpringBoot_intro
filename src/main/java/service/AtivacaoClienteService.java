package service;

import org.springframework.stereotype.Component;

import entidades.Cliente;
import notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;//neste ponto a vari�vel notificador � null pois n�o est� atribu�da a ningu�m
	
	public AtivacaoClienteService(NotificadorEmail notificador) {	
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService" + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar(); 
		
		this.notificador.notificar(cliente, "Seu cadastro foi efetivado.");
	}
}
