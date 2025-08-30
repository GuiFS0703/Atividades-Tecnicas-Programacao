package br.com.atv02TecProg.Abstracao;

public class Politico {
	public String nome, partido, cargo, mandato;
	public int idade;

	public void proporLeis() {
		System.out.println("Propondo novas leis!");
	}

	public void debater() {
		System.out.println("Irei defender meus projetos!");
	}

	public void organizarEventos() {
		System.out.println("Novos eventos públicos em andamento....");
	}
}
