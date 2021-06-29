package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuSegundoController {
	
	@GetMapping("/contatos")
	@ResponseBody
	public String toString() {
		return "Gustavo Nascimento Pereira e Flavia Almeida Turrini e Isabel Tinini Pereira"
				+ "Telefone: 99288-8912";
	}
}
