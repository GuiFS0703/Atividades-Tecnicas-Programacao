package br.com.atv02TecProg.Abstracao;

import java.util.ArrayList;
import java.util.List;

public class Atleta {
	public String nome, modalidade;
	public int idade;
	public List<String> premios = new ArrayList<>();
	public List<String> patrocinadores = new ArrayList<>();

	public void treinar() {
		System.out.println("Estou treinando muito! Que cansaço!");
	}

	public void competir() {
		System.out.println("Tamo competindo, tamo competindo!");
	}

	public void perfomar() {
		System.out.println("Estou fazendo minha melhor performace!");
	}
}
