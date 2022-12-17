package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.modelo.entidade.Cliente;
import com.example.demo.modelo.persistencia.ClienteRepository;

@SpringBootApplication
public class PetShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetShopApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(ClienteRepository repo) {
		return (args) -> {
			Cliente
			cliente = new Cliente("Pedro", "Rua A");
			repo.save(cliente);
			
		};
	}

}
