package com.devlearning.algafood.domain.repository;

import java.util.List;

import com.devlearning.algafood.domain.model.Cozinha;

public interface CozinhaRepository {

	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover(Cozinha cozinha);
	
}