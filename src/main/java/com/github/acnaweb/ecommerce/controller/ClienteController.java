package com.github.acnaweb.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/ping")
	public List<ClienteDTO> getAll() {
		List<ClienteDTO> result =null;
		return result;
	}

}
