package br.edu.fatecPg.tecProg.model;

public class Pessoa {
	private String nome, cpf, doc;
	private int idade;
	private Endereco end;

	public Pessoa(String nome, String cpf, String doc, int idade, Endereco end) {
		this.nome = nome;
		this.cpf = cpf;
		this.doc = doc;
		this.idade = idade;
		this.end = end;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", doc=" + doc + ", idade=" + idade + ", end=" + end + "]";
	}

}
