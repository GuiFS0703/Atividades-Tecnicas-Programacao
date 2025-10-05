package br.com.fatecpg.tecProg.model;

public class Funcionario {
	private String nome, cargo;
	private double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.trim().isEmpty()) {
			this.nome = nome;
		} else {
			System.out.println("Nome inválido!");
		}
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		if (cargo != null && !cargo.trim().isEmpty()) {
			this.cargo = cargo;
		} else {
			System.out.println("Cargo inválido!");
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario >= 1.518) { // salário mínimo
			this.salario = salario;
		} else {
			System.out.println("Salário inválido!");
		}
	}

}
