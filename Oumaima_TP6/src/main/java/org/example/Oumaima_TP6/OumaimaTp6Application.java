package org.example.Oumaima_TP6;

import entities.Compte;
import entities.TypeCompte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repositories.CompteRepository;

import java.util.Date;

@SpringBootApplication

public class OumaimaTp6Application {

	public static void main(String[] args) {
		SpringApplication.run(OumaimaTp6Application.class, args);
	}
@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {

			compteRepository.save(new Compte(null, 200, new Date(), TypeCompte.Epagne));
			compteRepository.save(new Compte(null, 70, new Date(), TypeCompte.Courant));
			compteRepository.save(new Compte(null, 58, new Date(), TypeCompte.Epagne));
			compteRepository.findAll().forEach(c ->{
				System.out.println(c.getSolde());
			});
		};

	}


}
