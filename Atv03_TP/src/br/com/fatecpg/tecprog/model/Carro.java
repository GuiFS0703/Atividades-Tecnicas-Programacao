package br.com.fatecpg.tecprog.model;

public class Carro {
	private String cor, modelo;
	private boolean ligado = false;
	private double qt_gasolina = 0, capacidade_tanque;
	private int ano;
	private ContaBancaria dono; // composição para facilitar a realização de algumas operações.

	// preferi definir a capacidade já no constructor
	public Carro(String modelo, double capacidade_tanque, ContaBancaria dono) {
		if (modelo == null || capacidade_tanque == 0 || dono == null) {
			throw new IllegalArgumentException("É necessário a inserção de valores válidos!");
			// lançando excessão para evitar criação de objeto.
		} else {
			this.modelo = modelo;
			this.capacidade_tanque = capacidade_tanque;
			this.dono = dono;
		}
	}

	public double calcularVlTanque(double vl_gasolina, double qt_litros_comprados) {
		if (vl_gasolina <= 0 || qt_litros_comprados <= 0) {
			System.out.println("Valores inválidos!");
			return 0;
		} else if (qt_litros_comprados > capacidade_tanque - this.qt_gasolina) {
			System.out.println("Capacidade de tanque insuficiente!");
			return 0;
		} else {
			return atualizarQt_gasolina(dono.sacarValor(vl_gasolina * qt_litros_comprados), qt_litros_comprados,
					vl_gasolina);
		}
	}

	// por que deixar este método privado? Simples, só irei autorizar o aumento da
	// qt de gasosa se o saldo for suficiente, e a composição do objeto de dono será
	// usado para fazer a verificação direta no calcularVlTanque para se for bem
	// sucedida chamar esse método de atualizar.
	private double atualizarQt_gasolina(double verificarValor, double gasolina, double vl_gasolina) {
		if (verificarValor == 0) {
			System.out.println("Seu saldo é inválido! Gasolina não pode ser adicionada!");
			return 0;
		} else {
			System.out.println("Abastecendo.....");
			this.qt_gasolina = gasolina;
			System.out.println("Total no tanque: " + qt_gasolina + "L");
			return gasolina * vl_gasolina;
		}
	}

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

	// Getters and Setters:

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getCapacidade_tanque() {
		return capacidade_tanque;
	}

	public void setCapacidade_tanque(Double capacidade_tanque) {
		this.capacidade_tanque = capacidade_tanque;
	}

	public double getQt_gasolina() {
		return qt_gasolina;
	}

}
