package com.example.demo.modelo.persistencia;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.entidade.Estoque;

public interface EstoqueRepository extends CrudRepository<Estoque, Long>{

}
