package com.erislandio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erislandio.cursomc.domain.Categoria;
import com.erislandio.cursomc.reporitories.CategoriaRepositorio;
import com.erislandio.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepositorio repo;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj= this.repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objecto não encontrado! Id: " + id + " Tipo: " + Categoria.class));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return this.repo.save(obj);
	}
	
}
