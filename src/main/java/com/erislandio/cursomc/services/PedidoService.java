package com.erislandio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erislandio.cursomc.domain.Pedido;
import com.erislandio.cursomc.reporitories.PedidoRepository;
import com.erislandio.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido findById(Integer id) {
		Optional<Pedido> obj= this.repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objecto não encontrado! Id: " + id + " Tipo: " + Pedido.class));
	}
	
}
