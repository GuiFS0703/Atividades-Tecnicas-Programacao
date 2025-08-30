package br.com.atv02TecProg.Abstracao;

import java.util.ArrayList;
import java.util.List;

public class Jornalista {
	public String nome, areaAtuacao; // poderia criar uma superclasse para evitar repetição de algumas propriedades,
										// mas achei que era desnecessário.
	public int Idade;
	public List<String> formacao = new ArrayList<>(); // mais flexível que Array
	public List<String> reportagensPublicadas = new ArrayList<>();

	public void entrevistar() {
		System.out.println("Olá! Estou entrevistando vc...");
	}

	public void documentar() {
		System.out.println("Estou documentando toda a reportagem...");
	}

	public void buscar() {
		System.out.println("Estou buscando novas informações....");
	}
}
