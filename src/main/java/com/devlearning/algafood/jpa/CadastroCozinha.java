package com.devlearning.algafood.jpa;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.devlearning.algafood.domain.model.Cozinha;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class CadastroCozinha {

	@PersistenceContext
	private EntityManager manager;
	
	public List<Cozinha> listar(){
		return manager.createQuery("from Cozinha", Cozinha.class)
				.getResultList();
	}
	
	public Cozinha buscar(Long id) {
		return manager.find(Cozinha.class, id);
	}
	
	@Transactional
	public Cozinha salvar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}
	
	@Transactional
	public void remover(Cozinha cozinha) {
		cozinha = buscar(cozinha.getId());
		manager.remove(cozinha);
	}
	
}