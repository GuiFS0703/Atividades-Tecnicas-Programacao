package br.edu.fatecpg.tecProg.model;

public class PagamentoDinheiro implements Ipagamentos {
	private double valorOriginal;
	private double valorTaxado;
	@Override
	public double calcularPagamento(double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido!");
			return 0;
		} else {
			this.valorOriginal = valor;
			this.valorTaxado = valor + (valor * 0.1);
			return valor + (valor * 0.1);
		}
	}

	public String emitirRecibo() {
		return "Valor original: " + this.valorOriginal + " | Valor taxado: " + this.valorTaxado;
	}
}
