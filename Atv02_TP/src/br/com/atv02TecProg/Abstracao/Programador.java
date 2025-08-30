package br.com.atv02TecProg.Abstracao;

import java.util.ArrayList;
import java.util.List;

public class Programador {
	public String nome, areaAtuacao, formacao;
	public int idade;

	public List<String> projetosDesenvolvidos = new ArrayList<>();

	public void programar() {
		System.out.println("Novo script sendo desenvolvido...");
	}

	public void corrigirProblemas() {
		System.out.println("Código deu erro de novo.... E lá vamos nós.");
	}

	public void testarAplicacoes() {
		System.out.println("Testando pra evitar uma bola de neve dps.");
	}
}
