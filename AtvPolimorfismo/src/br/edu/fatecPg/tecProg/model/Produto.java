package br.edu.fatecPg.tecProg.model;

public class Produto {
	String nome;
	double preco;
	int qtd;

	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto(String nome) {
		this.nome = nome;
	}
}
