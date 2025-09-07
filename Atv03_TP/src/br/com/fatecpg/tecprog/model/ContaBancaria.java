package br.com.fatecpg.tecprog.model;

public class ContaBancaria {
	private double saldo = 0;
	private final String titular; // final impede reatribuição de referência, impedindo que mudemos o titular

	public ContaBancaria(String titular) {
		if (titular == null) {
			throw new IllegalArgumentException("Deve se definir o titular da conta!");
		} else {
			this.titular = titular;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositarSaldo(double saldo) { // separei depositar e sacar para uma melhor organização
		if (saldo <= 0) {
			System.out.println("Valor inválido!");
		} else {
			System.out.println("Valor depositado com sucesso!");
			this.saldo += saldo;
		}
	}

	public double sacarValor(double vlSacado) {
		if (vlSacado > this.saldo || vlSacado <= 0) {
			System.out.println("Valor de depósito inválido!");
			return 0;
		} else {
			this.saldo -= vlSacado;
			return saldo;
		}
	}

	public String getTitular() {
		return titular;
	}

}
