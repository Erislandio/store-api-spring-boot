package com.erislandio.cursomc.reporitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erislandio.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{}
