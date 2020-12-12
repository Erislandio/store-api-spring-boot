package com.erislandio.cursomc.reporitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erislandio.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
}
