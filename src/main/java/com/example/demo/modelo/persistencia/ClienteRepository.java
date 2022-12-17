package com.example.demo.modelo.persistencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.entidade.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	
	

}
