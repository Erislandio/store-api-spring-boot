package com.erislandio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erislandio.cursomc.domain.Cliente;
import com.erislandio.cursomc.reporitories.ClienteRepository;
import com.erislandio.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	public ClienteRepository clienteRepository;
	
	public Cliente findById(Integer id) {
		Optional<Cliente> obj = this.clienteRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Cliente não econtrado, id: " + id + " Tipo: " + Cliente.class));
	}
	
}
