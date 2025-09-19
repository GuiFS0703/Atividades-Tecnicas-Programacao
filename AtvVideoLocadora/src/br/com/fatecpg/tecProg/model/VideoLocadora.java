package br.com.fatecpg.tecProg.model;

import java.util.Arrays;
import java.lang.Math;

public class VideoLocadora {
	private String[] filmes;
	private int[] vezesAlugado;
	private double[] precosLocacao;

	public VideoLocadora(int i) {
		if (i < 0) {
			throw new IllegalArgumentException("Valor inválido!");
		} else {
			this.filmes = new String[i];
			this.vezesAlugado = new int[i];
			this.precosLocacao = new double[i];
		}

	}

	public void listarFilmes() {
		for (int i = 0; i < this.filmes.length; i++) {
			System.out.println("filme nº" + (i + 1));
			System.out.println("Nome: " + this.filmes[i] + " | " + "preco: " + this.precosLocacao[i] + " | "
					+ "quantidade de vezes alugado: " + this.vezesAlugado[i]);
		}
	}

	public double faturamentoTotal() {
		double somaTotal = 0;
		for (int i = 0; i < this.filmes.length; i++) {
			somaTotal += this.precosLocacao[i];
		}
		System.out.println("Faturamento total: R$" + Math.round(somaTotal));
		return Math.round(somaTotal);
	}

	public void filmeMaisAlugado() {
		int indice = 0, qtdAlugado = this.vezesAlugado[0];
		for (int i = 0; i < this.filmes.length; i++) {
			if (qtdAlugado < this.vezesAlugado[i]) {
				qtdAlugado = this.vezesAlugado[i];
				indice = i;
			}
		}
		System.out.println("Filme mais alugado: " + this.filmes[indice] + " | " + "Qtd vezes alugado: " + qtdAlugado);
	}

	public void alugarFilme(int i) {
		if (i < 0 || i >= this.vezesAlugado.length || this.filmes[i] == null) {
			System.out.println("Esse filme não existe");
		} else {
			System.out.println("Antes: " + this.vezesAlugado[i]);
			this.vezesAlugado[i]++;
			System.out.println("Atualizado: " + this.vezesAlugado[i]);
		}
	}
	
	public void devolverFilme(int i) {
		if (i < 0 || i >= this.filmes.length || this.filmes[i] == null) {
			System.out.println("Livro inexistente!");
		} else {
			System.out.println("Livro devolvido");
		}
	}
//GETTERS + SETTERS:	

	public String[] getFilmes() {
		String[] getArray = Arrays.copyOf(filmes, filmes.length); // Por arrays serem objetos, não posso retornar o
																	// original pois um objeto armazena sua referência.
																	// Portanto, retornando sua referência, pode se
																	// atualizar os valores desse array mesmo com a
																	// propriedade privada.
		return getArray;
	}

	public void setFilmes(String filmes, int i) {
		if (filmes == null || filmes.trim().isEmpty()) { // trim() remove espaço
			System.out.println("Filme inválido!");
		} else if (i < 0 || i >= this.filmes.length) {
			System.out.println("Índice inválido!");
		} else {
			this.filmes[i] = filmes;
		}
	}

	public int[] getVezesAlugado() {
		int[] getArray = Arrays.copyOf(vezesAlugado, vezesAlugado.length);
		return getArray;
	}

	public void setVezesAlugado(int vezesAlugado, int i) {
		if (vezesAlugado <= 0) {
			System.out.println("Quantidade inválida!");
		} else if (i < 0 || i >= this.vezesAlugado.length) {
			System.out.println("Índice inválido!");
		} else {
			this.vezesAlugado[i] = vezesAlugado;
		}
	}

	public double[] getPrecosLocacao() {
		double[] getArray = Arrays.copyOf(precosLocacao, precosLocacao.length);
		return getArray;
	}

	public void setPrecosLocacao(double precosLocacao, int i) {
		if (precosLocacao <= 0) {
			System.out.println("Preço inválido!");
		} else if (i < 0 || i >= this.precosLocacao.length) {
			System.out.println("Índice inválido!");
		} else {
			this.precosLocacao[i] = precosLocacao;
		}
	}

}
