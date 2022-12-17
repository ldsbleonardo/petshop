package com.example.demo.modelo.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estoque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoEstoque;
	private Integer quantidade;
	private String localizacao;

	private Date dataEntradaProduto;
	private Date dataFabricacaoProduto;
	private Date dataVencimentoProduto;

	public Long getCodigoEstoque() {
		return codigoEstoque;
	}

	public void setCodigoEstoque(Long codigoEstoque) {
		this.codigoEstoque = codigoEstoque;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Date getDataEntradaProduto() {
		return dataEntradaProduto;
	}

	public void setDataEntradaProduto(Date dataEntradaProduto) {
		this.dataEntradaProduto = dataEntradaProduto;
	}

	public Date getDataFabricacaoProduto() {
		return dataFabricacaoProduto;
	}

	public void setDataFabricacaoProduto(Date dataFabricacaoProduto) {
		this.dataFabricacaoProduto = dataFabricacaoProduto;
	}

	public Date getDataVencimentoProduto() {
		return dataVencimentoProduto;
	}

	public void setDataVencimentoProduto(Date dataVencimentoProduto) {
		this.dataVencimentoProduto = dataVencimentoProduto;
	}

}
