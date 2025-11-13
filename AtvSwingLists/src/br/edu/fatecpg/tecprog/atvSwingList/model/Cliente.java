package br.edu.fatecpg.tecprog.atvSwingList.model;

public class Cliente {
	private String nome, email;

	public Cliente(String nome, String email) {
		if (nome != null && email != null) {
			this.nome = nome;
			this.email = email;
		} else {
			throw new IllegalArgumentException("Parâmetros inválidos!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
