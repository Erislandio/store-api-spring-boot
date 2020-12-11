package com.erislandio.cursomc.reporitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erislandio.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
