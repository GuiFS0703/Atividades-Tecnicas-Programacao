package br.com.atv02TecProg.Abstracao;

public class Carro {
	public String cor, modelo, capacidade_tanque;
	private boolean ligado = false;

	public void ligarCarro() {
		if (ligado == false) {
			System.out.println("Ligando o carro....");
			ligado = true;
		} else {
			System.out.println("Carro já está ligado!");
		}
	}

	public void desligarCarro() {
		if (ligado == true) {
			System.out.println("Desligando carro...");
			ligado = false;
		} else {
			System.out.println("Carro já está desligado!");
		}
	}

	public void frearCarro() {
		if (ligado == true) {
			System.out.println("Freando carro!!");
		} else {
			System.out.println("Não é possível frear com o carro desligado!");
		}
	}

	public void acelerarCarro() {
		if (ligado == true) {
			System.out.println("Acelerando....");
		} else {
			System.out.println("Ligue o Carro para acelerar!");
			this.ligarCarro();
			this.acelerarCarro();
		}
	}
}
