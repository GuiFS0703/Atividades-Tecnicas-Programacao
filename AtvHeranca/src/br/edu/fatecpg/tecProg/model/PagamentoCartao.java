package br.edu.fatecpg.tecProg.model;

public class PagamentoCartao implements Ipagamentos {
	private double valorOriginal;
	private double valorTaxado;

	@Override
	public double calcularPagamento(double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido!");
			return 0;
		} else {
			this.valorOriginal = valor;
			this.valorTaxado = valor + (valor * 0.05);
			return valor + (valor * 0.05);
		}
	}

	public String emitirRecibo() {
		return "Valor original: " + this.valorOriginal + " | Valor taxado: " + this.valorTaxado;
	}

}
