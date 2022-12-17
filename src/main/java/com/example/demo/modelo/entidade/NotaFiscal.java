package com.example.demo.modelo.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotaFiscal  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNota;

    private String numero;
    
    private Integer quantidade;
    
    private Double valorUnidade;
    
    private Double valorTotal;

    private TipoNotaEnum tipo;
    
    private String tipoNota;
    
    public NotaFiscal(TipoNotaEnum tipo, String tipoNota) {
		super();
		this.tipo = tipo;
		this.tipoNota = tipoNota;
	}

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoNotaEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoNotaEnum tipo) {
        this.tipo = tipo;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
	public Double getValorUnidade() {
		return valorUnidade;
	}
	
	public void setValorUnidade(Double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}
	
	public Double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
}