package com.devlearning.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.devlearning.algafood.AlgafoodApiApplication;
import com.devlearning.algafood.domain.model.Cozinha;
import com.devlearning.algafood.domain.repository.CozinhaRepository;

public class AlterarCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cadastroCozinha = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		cozinha.setNome("Brasileira");
		
		cadastroCozinha.salvar(cozinha);
		
	}
	
}