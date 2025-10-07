package br.com.fatecpg.tecProg.model;

import java.util.Arrays;

public class Supermercado {
	private String[] nomesProdutos;
	private double[] precos, descontos;
	private double totalCompra = 0; // n é mt correto ficar nesta classe, mas é oq tem.

	public Supermercado(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("Índice de inicialização de array inválido!");
		} else {
			this.nomesProdutos = new String[i];
			this.descontos = new double[i];
			this.precos = new double[i];
		}
	}

	public void inserirProduto(int i, String nome, double preco, double desconto) { // inútil ter o reporProduto() se já
																					// existe o inserirProduto() que faz
																					// a mesma coisa.
		if (i < 0 || i >= nomesProdutos.length) {
			System.out.println("Índice inválido!");
		} else if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Nome inválido!");
		} else if (preco <= 0 || desconto < 0) {
			System.out.println("Preço ou desconto inválidos!");
		} else {
			this.nomesProdutos[i] = nome;
			this.precos[i] = preco;
			this.descontos[i] = desconto;
		}
	}

	public void listarProdutos() {
		for (int i = 0; i < this.nomesProdutos.length; i++) {
			if (this.nomesProdutos[i].trim().length() > 0 && this.descontos[i] >= 0 && this.precos[i] >= 0) {
				System.out.println("Nome: " + this.nomesProdutos[i] + " | " + "Valor: " + this.precos[i] + " | "
						+ "Valor com desconto: " + (this.precos[i] - (this.precos[i] * (this.descontos[i] / 100))));
			}
		}
	}

	public void exibirProdutoBarato() {
		String nome = "";
		double menorVl = Double.MAX_VALUE;
		for (int i = 0; i < this.nomesProdutos.length; i++) {
			if (this.nomesProdutos[i] != null) {
				if ((this.precos[i] - (this.precos[i] * (this.descontos[i] / 100))) < menorVl) {
					menorVl = this.precos[i] - (this.precos[i] * (this.descontos[i] / 100));
					nome = this.nomesProdutos[i];
				}
			}
		}
		System.out.println("Produto + barato com desconto: " + nome + " | " + "Preço: " + menorVl);
	}

	private double totalizarCompra(int i) { // evitar usuarisse de alterar diretamente
		return this.totalCompra += (this.precos[i] - (this.precos[i] * (this.descontos[i] / 100)));
	} // o mais correto sera ter um método também de finalizar compra para zerar esse
		// total, mas n foi pedido ent deixa....

	public void comprarProduto(int i) {
		if (this.nomesProdutos[i] != null && !this.nomesProdutos[i].trim().isEmpty()) {
			double total = this.totalizarCompra(i);
			this.nomesProdutos[i] = "";
			this.descontos[i] = 0;
			this.precos[i] = 0;
			System.out.println("Produto comprado com sucesso!!");
			System.out.println("Total atualizado: " + total);
		}
	}

	/* GETTERS: (sem necessidade de setters (se bem que tmb n tem ne) */

	public String[] getNomesProdutos() {
		String[] arrayRetorno = Arrays.copyOf(this.nomesProdutos, this.nomesProdutos.length);
		return arrayRetorno;
	}

	public double[] getPrecos() {
		double[] arrayRetorno = Arrays.copyOf(this.precos, this.precos.length);
		return arrayRetorno;
	}

	public double[] getDescontos() {
		double[] arrayRetorno = Arrays.copyOf(this.descontos, this.descontos.length);
		return arrayRetorno;
	}

}
