package com.estoque_bebidas.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.estoque_bebidas.apirest.models.Bebida;
import com.estoque_bebidas.apirest.models.SecaoBebida;

@EnableJpaRepositories
public interface EstoqueRepository extends JpaRepository<Bebida, Long>{
	
	   
	Bebida findById(long id);
	SecaoBebida save(SecaoBebida secao);
	
}

