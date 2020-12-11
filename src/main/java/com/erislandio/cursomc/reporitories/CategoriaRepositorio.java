package com.erislandio.cursomc.reporitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erislandio.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer> {

}
