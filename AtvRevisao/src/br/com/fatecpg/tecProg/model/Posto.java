package br.com.fatecpg.tecProg.model;

public class Posto {
	private String[] tiposCombustiveis;
	private double[] precosLitro;
	private int[] litrosDisponiveis;

	public Posto(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("Índice inválido!");
		} else {
			this.litrosDisponiveis = new int[i];
			this.precosLitro = new double[i];
			this.tiposCombustiveis = new String[i];
		}
	}

	public void inserirCombustivel(int i, String tipo, double preco, int litroDisponivel) {
		if (i < 0 || i >= this.litrosDisponiveis.length) {
			System.out.println("Índice inválido!");
		} else if (tipo == null || tipo.trim().isEmpty()) {
			System.out.println("Tipo inválido!");
		} else if (preco <= 0) {
			System.out.println("Preço inválido!");
		} else if (litroDisponivel < 0) {
			System.out.println("Quantidade líquida inválida!");
		} else {
			this.tiposCombustiveis[i] = tipo;
			this.precosLitro[i] = preco;
			this.litrosDisponiveis[i] = litroDisponivel;
		}
	}

	public void exibirCombustiveis() {
		for (int i = 0; i < this.litrosDisponiveis.length; i++) {
			if (this.tiposCombustiveis[i] != null) {
				System.out.println("Nome: " + this.tiposCombustiveis[i] + " | " + "Quantidade disponível: "
						+ this.litrosDisponiveis[i] + " | " + "Preço por litro: " + this.precosLitro[i]);
			}
		}
	}

	public void calcularEstoque() {
		double total = 0;
		for (int i = 0; i < this.litrosDisponiveis.length; i++) {
			total += this.precosLitro[i] * this.litrosDisponiveis[i];
		}
		System.out.println("Valor do estoque: " + total);
	}

	public void verificarMaiorMenorEstoque() {
		String nomeMaior = "", nomeMenor = "";
		double qtdMaior = Double.MIN_VALUE, qtdMenor = Double.MAX_VALUE;

		for (int i = 0; i < this.litrosDisponiveis.length; i++) {
			if (this.tiposCombustiveis[i] != null) {
				if (qtdMenor > this.litrosDisponiveis[i]) {
					qtdMenor = this.litrosDisponiveis[i];
					nomeMenor = this.tiposCombustiveis[i];
				}
				if (qtdMaior < this.litrosDisponiveis[i]) {
					qtdMaior = this.litrosDisponiveis[i];
					nomeMaior = this.tiposCombustiveis[i];
				}
			}
		}
		System.out.println("Combustível com maior estoque: " + nomeMaior + " | " + qtdMaior + "L");
		System.out.println("Agora, o com menor: " + nomeMenor + " | " + qtdMenor + "L");
	}

	public void venderCombustivel(int i, double qtd) {
		if (i < 0 || i >= this.litrosDisponiveis.length) {
			System.out.println("Índice inválido!");
		} else if (qtd < 0 || qtd > this.litrosDisponiveis[i]) {
			System.out.println("Quantidade inválida!");
		} else {
			this.litrosDisponiveis[i] -= qtd;
			System.out.println("Combustível comprado com sucesso!");
		}
	}

	public void reabastecerCombustivel(double qtd, int i) {
		if (i < 0 || i >= this.litrosDisponiveis.length) {
			System.out.println("Índice inválido!");
		} else if (qtd <= 0) {
			System.out.println("Quantidade inválida!");
		} else {
			this.litrosDisponiveis[i] += qtd;
			System.out.println("Reabastecimento completo! O combustível " + this.tiposCombustiveis[i] + " está com "
					+ this.litrosDisponiveis[i] + "L disponíveis!");
		}
	}
}
