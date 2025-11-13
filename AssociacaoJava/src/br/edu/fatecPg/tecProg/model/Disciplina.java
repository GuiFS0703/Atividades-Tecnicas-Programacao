package br.edu.fatecPg.tecProg.model;

public class Disciplina {
	private String disciplina, curso, anoSemestre;
	private Aluno aluno;

	public Disciplina(String disciplina, String curso, String anoSemestre, Aluno aluno) {
		this.disciplina = disciplina;
		this.curso = curso;
		this.anoSemestre = anoSemestre;
		this.aluno = aluno;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getAnoSemestre() {
		return anoSemestre;
	}

	public void setAnoSemestre(String anoSemestre) {
		this.anoSemestre = anoSemestre;
	}

	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", curso=" + curso + ", anoSemestre=" + anoSemestre + ", aluno="
				+ aluno + "]";
	}

}
