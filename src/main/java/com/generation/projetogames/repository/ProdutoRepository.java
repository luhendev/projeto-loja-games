package com.generation.projetogames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.projetogames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByPlataformaContainingIgnoreCase(@Param("plataforma") String plataforma);
}
