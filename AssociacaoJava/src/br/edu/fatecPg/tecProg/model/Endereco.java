package br.edu.fatecPg.tecProg.model;

public class Endereco {
	private String rua, cep, numero;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Endereco(String rua, String cep, String numero) {
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cep=" + cep + ", numero=" + numero + "]";
	}
}
