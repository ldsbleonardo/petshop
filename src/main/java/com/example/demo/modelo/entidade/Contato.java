package com.example.demo.modelo.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private TipoContatoEnum tipo;

	private String valor;

	public Contato() {
	}

	public Contato(TipoContatoEnum tipo, String valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", tipo=" + tipo + ", valor=" + valor + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoContatoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoContatoEnum tipo) {
		this.tipo = tipo;
	}

}
