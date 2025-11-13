package br.edu.fatecpg.tecprog.atvSwingList.model;

public class Funcionario {
	private String nome, cargo;
	private double salario;

	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.setSalario(salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
