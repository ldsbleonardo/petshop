package com.example.demo.modelo.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    private String nome;
    
    private String endereco;
    
    private String numero;
   
    private String bairro;
    
    private String cep;

   
    public Long getCodigo() {
        return codigo;
    }

   
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public String getEndereco() {
        return endereco;
    }

  
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public String getNumero() {
        return numero;
    }

   
    public void setNumero(String numero) {
        this.numero = numero;
    }

   
    public String getBairro() {
        return bairro;
    }

  
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

 
    public String getCep() {
        return cep;
    }

   
    public void setCep(String cep) {
        this.cep = cep;
    }

}

