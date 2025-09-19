package br.com.fatecpg.tecprog.atv04.model;

public class Loja {
	private String[] nomesProdutos;
	private int[] quantidadeEstoque;
	private double[] precosProdutos;

	public Loja(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("Valor deve ser maior que 0");
			// lançado exceção para evitar inicialização do obj
		} else {
			this.nomesProdutos = new String[i];
			this.quantidadeEstoque = new int[i];
			this.precosProdutos = new double[i];
		}
	}

	public boolean inserirProduto(String nome, int i, double preco, int qtd) {
		if (nome == null || nome.isEmpty() || i < 0 || preco <= 0 || qtd < 0) { // isempty verifica se n te caracteres
			System.out.println("Valor inválido! Tente novamente!");
			return false;
		} else {
			this.nomesProdutos[i] = nome;
			this.quantidadeEstoque[i] = qtd;
			this.precosProdutos[i] = preco;
			System.out.println("Novo produto: " + this.getNomeProduto(i));
			return true;
		}
	}

	public void exibirProdutos() {
		for (int i = 0; i < this.nomesProdutos.length; i++) {
			System.out.println("Nome: " + nomesProdutos[i] + " | " + "quantidade: " + this.quantidadeEstoque[i] + " | "
					+ "preço: " + this.precosProdutos[i]);
		}
	}

	public double getMaiorMenorProduto() {
		double maiorPreco = 0, menorPreco = Double.MAX_VALUE;
		for (int i = 0; i < this.precosProdutos.length; i++) {
			if (this.nomesProdutos[i] != null) {
				if (this.precosProdutos[i] > maiorPreco) {
					maiorPreco = this.precosProdutos[i];
				}
				if (this.precosProdutos[i] < menorPreco) {
					menorPreco = this.precosProdutos[i];
				}
			}
		}
		System.out.println("Maior preço de produto: " + maiorPreco + "\n" + "Menor preço: " + menorPreco);
		return maiorPreco + menorPreco;
	}

	public double calcularVlEstoque() {
		double vlEstoque = 0;
		for (int i = 0; i < this.nomesProdutos.length; i++) {
			if (this.precosProdutos[i] > 0 && this.quantidadeEstoque[i] > 0) {
				vlEstoque += (this.precosProdutos[i] * this.quantidadeEstoque[i]);
			}
		}
		return vlEstoque;
	}

	public void comprarProduto(int i, int qtd) {
		if (i >= this.nomesProdutos.length || i < 0 || this.getNomeProduto(i) == null) {
			System.out.println("Produto inválido!");
		} else if (qtd > this.getQuantidadeProduto(i)) {
			System.out.println("Seu pedido excede o estoque de produtos!");
		} else if (qtd <= 0) {
			System.out.println("Valor inválido de quantidade!");
		} else {
			this.setQuantidadeproduto(i, this.getQuantidadeProduto(i) - qtd);
			System.out.println("Produto comprado: " + this.nomesProdutos[i]);
			System.out.println("Estoque atual: " + this.getQuantidadeProduto(i));
			System.out.println("Valor total: " + this.getPrecoProduto(i) * qtd);
		}
	}

	/* Getters e Setters: */

	public String getNomeProduto(int i) {
		return this.nomesProdutos[i];
	}

	public int getQuantidadeProduto(int i) {
		return this.quantidadeEstoque[i];
	}

	public double getPrecoProduto(int i) {
		return this.precosProdutos[i];
	}

	public void setNomeProduto(int i, String nome) {
		if (i >= this.nomesProdutos.length || i < 0) {
			System.out.println("Produto não encontrado!");
		} else if (nome == null || nome.isEmpty()) {
			System.out.println("Nome inválido!");
		} else {
			this.nomesProdutos[i] = nome;
		}
	}

	public void setQuantidadeproduto(int i, int qtd) { // já substitui a necessidade de ter um método de aumentar
														// estoque.
		if (i >= this.nomesProdutos.length || i < 0) {
			System.out.println("Produto não encontrado!");
		} else if (qtd < 0) {
			System.out.println("Quantidade inválida!");
		} else {
			this.quantidadeEstoque[i] = qtd;
		}
	}

	public void setPrecoProduto(int i, double vl) {
		if (i >= this.nomesProdutos.length || i < 0) {
			System.out.println("Produto não encontrado!");
		} else if (vl <= 0) {
			System.out.println("Valor inválido!");
		} else {
			this.precosProdutos[i] = vl;
		}
	}

}
