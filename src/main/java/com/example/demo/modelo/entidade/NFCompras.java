package com.example.demo.modelo.entidade;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class NFCompras extends NotaFiscal{
    
    private String descricaoProduto;
    private Date dataCompra;
    private int codigoFornecedor;
        
    public NFCompras(TipoNotaEnum tipo, String tipoNota) {
        super(tipo, tipoNota);
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    } 
    
}
