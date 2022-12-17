package com.example.demo.modelo.entidade;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class NFVendas extends NotaFiscal{
    
    private Integer idCodigoCliente;
    private Date dataVenda;
    private Double valorVenda;
    
    
    public NFVendas(TipoNotaEnum tipo, String tipoNota) {
        super(tipo, tipoNota);
    }

    public Integer getIdCodigoCliente() {
        return idCodigoCliente;
    }

    public void setIdCodigoCliente(Integer idCodigoCliente) {
        this.idCodigoCliente = idCodigoCliente;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
}
