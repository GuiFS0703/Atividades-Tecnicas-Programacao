package br.edu.fatecPg.tecProg.model;

public class Compra {
	private String prod;
	private double valor;

	public Compra(String prod, double valor) {
		this.prod = prod;
		this.valor = valor;
	}

	public String finalizarCompra(Cupom cupom) {
		return "Compra realizada! Valor do produto: " + (this.valor - cupom.getValor());
	}

	@Override
	public String toString() {
		return "Compra [prod=" + prod + ", valor=" + valor + "]";
	}
}
