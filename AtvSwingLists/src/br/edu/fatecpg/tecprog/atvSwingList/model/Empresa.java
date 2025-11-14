package br.edu.fatecpg.tecprog.atvSwingList.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	List<Cliente> Clientes = new ArrayList<>();
	List<Funcionario> Funcionarios = new ArrayList<>();
	double mediaSalarial;

	public Empresa() {
		this.mediaSalarial = 0;
	}

	public boolean addCliente(String nome, String email) {
		if (this.Clientes.size() >= 10) { // era 5 antes
			System.out.println("Limite de clientes alcançado!");
			return false;
		} else if (nome != null && email != null) {
			Cliente cliente = new Cliente(nome, email);
			this.Clientes.add(cliente);
			return true;
		} else {
			System.out.println("Parâmetro inválido!");
			return false;
		}
	}

	public List<Cliente> exibirClientes() {
		return this.Clientes; // retornar é melhor pq ai vou exibir unitariamente na GUI
	}

	public boolean addFuncionario(String nome, String cargo, Double salario) {
		if (this.Funcionarios.size() >= 10) { // era 5 antes
			System.out.println("Limite de clientes alcançado!");
			return false;
		}
		else if (nome != null && cargo != null && salario > 0) {
			Funcionario funcionario = new Funcionario(nome, cargo, salario);
			Funcionarios.add(funcionario);
			return true;
		} else {
			System.out.println("Parâmetros inválidos!");
			return false;
		}
	}

	public List<Funcionario> exibirFuncionario() {
		return this.Funcionarios;
	}

	public double retornarFolhaSalarial() {
		double folha = 0;
		for (Funcionario funcionario : this.Funcionarios) {
			folha += funcionario.getSalario();
		}
		return folha;
	}

	public void calcularMediaSalarial(Calculadora cal) {
		double media = 0;
		int qtdFuncionario = 0;
		for (Funcionario funcionario : this.Funcionarios) {
			media = cal.soma(media, funcionario.getSalario());
			qtdFuncionario++;
		}
		media = media / qtdFuncionario;
		this.mediaSalarial = media;
	}

	public double exibirMediaSalarial() {
		return this.mediaSalarial;
	}
}
