package br.edu.fatecPg.tecProg.model;

public class Cupom {
	private String codigo;
	private double valor;

	public Cupom(String codigo, double valor) {
		super();
		this.codigo = codigo;
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Cupom [codigo=" + codigo + ", valor=" + valor + "]";
	}
}
