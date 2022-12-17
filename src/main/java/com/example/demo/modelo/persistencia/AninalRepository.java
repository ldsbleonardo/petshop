package com.example.demo.modelo.persistencia;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.entidade.Animal;

public interface AninalRepository extends CrudRepository<Animal, Long>{

	
}
