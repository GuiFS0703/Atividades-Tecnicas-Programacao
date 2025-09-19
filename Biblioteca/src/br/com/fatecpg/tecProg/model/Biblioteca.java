package br.com.fatecpg.tecProg.model;

import java.util.Arrays;

public class Biblioteca {
	String[] livros;
	int[] diasATrasos; //esses dois ficaram sem sentido no código pq nao teria da onde saber quando teria atraso
	double[] multaPorDia; 
	String[] livrosEmprestados;

	public Biblioteca(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("Valor inválido!");
		} else {
			this.livros = new String[i];
			this.diasATrasos = new int[i];
			this.multaPorDia = new double[i];
			this.livrosEmprestados = new String[i];
		}
	}

	public void exibirLivros() {
		for (int i = 0; i < this.livros.length; i++) {
			System.out.println("Livro nº" + (i + 1));
			System.out.println("Nome: " + livros[i] + " | " + "Quantidade de atraso: " + this.diasATrasos[i] + " | "
					+ "Diária atraso: " + this.multaPorDia[i]);
		}
	}

	public void multaTotalAcumulada() {
		double total = 0;
		for (int i = 0; i < this.livros.length; i++) {
			if (this.multaPorDia[i] > 0 && this.diasATrasos[i] > 0) {
				total += (this.multaPorDia[i] * this.diasATrasos[i]);
			}
		}
		System.out.println("Totala receber: " + total);
	}

	public void mediaDiasAtraso() {
		double mediaDias = 0;
		double qtLivrosEmprestados = 0;
		for (int i = 0; i < this.livros.length; i++) {
			if (this.diasATrasos[i] > 0) {
				mediaDias += this.diasATrasos[i];
				qtLivrosEmprestados++;
			}
		}

		if (qtLivrosEmprestados > 0) {
			mediaDias = mediaDias / qtLivrosEmprestados;
			System.out.println("Média de dias em atraso: " + mediaDias);
		} else {
			System.out.println("Nenhum livro com atraso.");
		}
	}

	public void emprestarLivro(String livro) {
		boolean encontrado = false;

		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && livros[i].equals(livro)) {
				for (int j = 0; j < livrosEmprestados.length; j++) {
					if (livrosEmprestados[j] == null) {
						livrosEmprestados[j] = livro;
						System.out.println("Livro emprestado: " + livro);
						encontrado = true;
						break;
					}
				}
				break; // já encontrou, sai do loop de livros
			}
		}

		if (!encontrado) {
			System.out.println("Livro inexistente!");
		}
	}

	public void devolverLivro(String livro) {
		for (int i = 0; i < this.livrosEmprestados.length; i++) {
			if (this.livrosEmprestados[i] != null && this.livrosEmprestados[i].equals(livro)) {
				this.livrosEmprestados[i] = null;
				break;
			}
		}
	}

	/* GETTERS + SETTERS: */

	public String[] getLivrosEmprestados() {
		String[] getArray = Arrays.copyOf(livrosEmprestados, livrosEmprestados.length);
		return getArray;
	}

	public String[] getLivros() {
		String[] getArray = Arrays.copyOf(livros, livros.length);
		return getArray;
	}

	public void setLivros(String livros, int i) { // apenas este n tem problema existir
		if (livros == null || livros.trim().isEmpty()) {
			System.out.println("Livro inválido!");
		} else if (i < 0 || i >= this.livros.length) {
			System.out.println("Índice inválido!");
			return;
		} else {
			this.livros[i] = livros;
		}
	}

	public int[] getDiasATrasos() {
		int[] getArray = Arrays.copyOf(diasATrasos, diasATrasos.length);
		return getArray;
	}

	public double[] getMultaPorDia() {
		double[] getArray = Arrays.copyOf(multaPorDia, multaPorDia.length);
		return getArray;
	}
	// sem setters dos 3 pra evitar mudanças externas não autorizadas.
}
