package com.devlearning.algafood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devlearning.algafood.domain.repository.CozinhaRepository;

@SpringBootApplication
public class AlgafoodApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgafoodApiApplication.class, args);
	}

	CozinhaRepository cozinhaRepository;

}
