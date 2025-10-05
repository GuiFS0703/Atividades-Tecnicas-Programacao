package br.com.fatecpg.tecProg.model;

public class ContaBancaria {
	private String titular;
	private int numeroConta;
	private double saldo;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if (titular != null && !titular.trim().isEmpty()) {
			this.titular = titular;
		} else {
			System.out.println("titular inválido!");
		}
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		if (numeroConta > 0) {
			this.numeroConta = numeroConta;
		} else {
			System.out.println("Número de conta inválido!");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo; // n faz sentido validar pq pode add ou remover.....
	}

}
