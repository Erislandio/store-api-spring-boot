package com.erislandio.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erislandio.cursomc.domain.Cliente;
import com.erislandio.cursomc.services.ClienteService;


@RestController
@RequestMapping(value = "/cliente")
public class ClientResources {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> findById(@PathVariable Integer id) {
		Cliente client = this.clienteService.findById(id);
		return ResponseEntity.ok().body(client);
	}
	
}
