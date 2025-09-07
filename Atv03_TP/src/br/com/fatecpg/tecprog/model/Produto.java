package br.com.fatecpg.tecprog.model;

public class Produto {
	private String nome;
	private double preco;
	private int qt_estoque;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() == 0) {
			System.out.println("Nome inválido!");
		} else {
			this.nome = nome;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			System.out.println("Valor inválido!");
		} else {
			this.preco = preco;
		}
	}

	public int getQt_estoque() {
		return qt_estoque;
	}

	public void setQt_estoque(int qt_estoque) {
		if (qt_estoque == 0) {
			System.out.println("Valor inválido!");
		} else {
			this.qt_estoque += qt_estoque;
		}
	}

}
