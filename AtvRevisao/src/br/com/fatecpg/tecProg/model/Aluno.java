package br.com.fatecpg.tecProg.model;

public class Aluno {
	private String nome;
	private boolean matricula; // não especificou se era data ou se significava que estava ou não ativa...
	private double notaFinal = 0;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.trim().isEmpty()) {
			this.nome = nome.trim();
		} else {
			System.out.println("Nome inválido!");
		}
	}

	public boolean getMatricula() {
		return matricula;
	}

	public void setMatricula(boolean matricula) {
		this.matricula = matricula; // n faz sentido validar pq é false como padrão
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		if (notaFinal >= 0 && notaFinal<=10) {
			this.notaFinal = notaFinal;
		} else {
			System.out.println("Nota inválida!");
		}
	}
}
