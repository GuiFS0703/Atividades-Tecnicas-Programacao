package br.com.fatecpg.tecProg.model;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Farmacia {
	private String[] nomesMedicamentos;
	private int[] diasParaVencimento;
	private double[] precos;

	public Farmacia(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("Índice inválido!");
		} else {
			this.nomesMedicamentos = new String[i];
			this.diasParaVencimento = new int[i];
			this.precos = new double[i];
		}
	}

	public void inserirMedicamento(String nome, int data, double preco, int i) { // inserindo esse método a mais para
		// ter a inserção do produto
		// centralizada
		if (i < 0 || i >= this.nomesMedicamentos.length) {
			System.out.println("Índice inválido!");
		} else if (preco <= 0) {
			System.out.println("Preço inválido!");
		} else if (data <= 0) {
			System.out.println("Data inválida!");
		} else if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Nome inválido!");
		} else {
			this.nomesMedicamentos[i] = nome;
			this.diasParaVencimento[i] = data;
			this.precos[i] = preco;
		}
	}

	public void mostrarMedicamentos() {
		for (int i = 0; i < this.nomesMedicamentos.length; i++) {
			if (this.nomesMedicamentos[i].trim().length() > 0 && this.diasParaVencimento[i] >= 0
					&& this.precos[i] > 0) {
				System.out.println("Nome do medicamento: " + this.nomesMedicamentos[i] + " | "
						+ "Dias para vencimento: " + this.diasParaVencimento[i] + " | " + "Preço: " + this.precos[i]);
			}
		}
	}

	public double mediaVencimentoRemedio() {
		DecimalFormat padrao = new DecimalFormat("0.00"); // pra limitar casas decimais
		double media = 0;
		int qtd = 0;
		for (int i = 0; i < this.nomesMedicamentos.length; i++) {
			if (this.diasParaVencimento[i] != 0) {
				media += this.diasParaVencimento[i];
				qtd++;
			}
		}
		media /= qtd;
		System.out.println("Média de dias: " + padrao.format(media));
		return media;
	}

	public void exibirRemediosProxVencimento() {
		for (int i = 0; i < this.nomesMedicamentos.length; i++) {
			if (this.diasParaVencimento[i] <= 5) {
				System.out.println("Este remédio chamado " + this.nomesMedicamentos[i]
						+ " está com menos de 6 dias para o vencimento, ou seja: " + this.diasParaVencimento[i]);
			}
		}
	}

	public void aplicadorAutomaticoDesconto() {
		for (int i = 0; i < this.nomesMedicamentos.length; i++) {
			if (this.diasParaVencimento[i] <= 5) {
				System.out
						.println("Preço anterior do medicamento " + this.nomesMedicamentos[i] + ": " + this.precos[i]);
				this.precos[i] = this.precos[i] - (this.precos[i] * 0.5);
				System.out.println("Preço agora: " + this.precos[i]);
			}
		}
	}

	public void venderMedicamento(int i) {
		if (i < 0 || i >= this.nomesMedicamentos.length) {
			System.out.println("Produto inválido!");
		} else {
			System.out.println("Parabéns! Você adquiriu o medicamento " + this.nomesMedicamentos[i] + "!");
			this.nomesMedicamentos[i] = "";
			this.diasParaVencimento[i] = 0;
			this.precos[i] = 0;
		}
	}

	/* GETTERS: */
	public String[] getNomesMedicamentos() {
		String[] returnArray = Arrays.copyOf(this.nomesMedicamentos, this.nomesMedicamentos.length);
		return returnArray; // usando outro array para o 'user' não alterar o array original, já que um
							// objeto retorna sua referência e n value
	}

	public int[] getDiasParaVencimento() {
		int[] returnArray = Arrays.copyOf(this.diasParaVencimento, this.diasParaVencimento.length);
		return returnArray;
	}

	public double[] getPrecos() {
		double[] returnArray = Arrays.copyOf(this.precos, this.precos.length);
		return returnArray;
	}

}
