package com.generation.lojagames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "tb_produto") // CREATE TABLE 

public class Produto {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(length = 100)
	@NotBlank(message = "O nome é obrigatório!")
    private String nome;
	
	@Column(length = 1000)
	@NotBlank(message = "A descrição obrigatória!")
	private String descricao;
    
	@NotBlank(message = "O preço obrigatório!")
	private double preco;

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
    
    private String console;
   
    @ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
    
    
}
