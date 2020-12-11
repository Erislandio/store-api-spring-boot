package com.erislandio.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.erislandio.cursomc.domain.Categoria;
import com.erislandio.cursomc.domain.Cidade;
import com.erislandio.cursomc.domain.Estado;
import com.erislandio.cursomc.domain.Produto;
import com.erislandio.cursomc.reporitories.CategoriaRepositorio;
import com.erislandio.cursomc.reporitories.CidadeRepository;
import com.erislandio.cursomc.reporitories.EstadoRepository;
import com.erislandio.cursomc.reporitories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		Produto p1 = new Produto(null, "Mouse", 200.00);
		Produto p2 = new Produto(null, "Teclado", 399.00);
		Produto p3 = new Produto(null, "Microfone", 1779.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p1, p2));
		
		Estado est1 = new Estado(null, "Minas gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade cidade1 = new Cidade(null, "São paulo");
		Cidade cidade2 = new Cidade(null, "Bragança Paulista");
		
		est1.getCidades().addAll(Arrays.asList(cidade1, cidade2));
		
		this.estadoRepository.save(est1);
		this.estadoRepository.save(est2);
		
		this.cidadeRepository.save(cidade1);
		this.cidadeRepository.save(cidade2);
		
		this.categoriaRepositorio.save(cat1);
		this.categoriaRepositorio.save(cat2);
		
		this.produtoRepository.save(p1);
		this.produtoRepository.save(p2);
		this.produtoRepository.save(p3);
		 
	}
	
}
	