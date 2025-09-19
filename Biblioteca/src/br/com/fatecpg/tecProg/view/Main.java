package br.com.fatecpg.tecProg.view;

import br.com.fatecpg.tecProg.model.*;

public class Main {

	public static void main(String[] args) {
		Biblioteca Saraiva = new Biblioteca(8);
		Saraiva.setLivros("AAA", 0);
		Saraiva.exibirLivros();
		Saraiva.emprestarLivro("AAA");
		Saraiva.devolverLivro("AAA");
		// Não deu tempo de terminar tudo.
		// Justificativa: tinha mt atividade p fazer essa semana, inclusive um seminário
		// p essa semana.
	}

}
