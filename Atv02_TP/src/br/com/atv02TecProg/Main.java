package br.com.atv02TecProg;

import br.com.atv02TecProg.Abstracao.*;

public class Main {

	public static void main(String[] args) {
		Carro carrinho = new Carro();
		carrinho.cor = "Vermelho";
		carrinho.modelo = "Mitsubishi Eclipse Gst";
		carrinho.capacidade_tanque = "55L";
		carrinho.acelerarCarro();
		carrinho.frearCarro();
		carrinho.desligarCarro();
		System.out.println("Propriedades do carro: " + carrinho.modelo + " | " + carrinho.cor + " | "
				+ carrinho.capacidade_tanque);

		System.out.println("===================================================================");

		Jornalista Bonner = new Jornalista();
		Bonner.nome = "William Bonner";
		Bonner.formacao.add("Comunicação Digital");
		Bonner.Idade = 61;
		Bonner.reportagensPublicadas.add("Lorem Ipsum");
		Bonner.areaAtuacao = "Apresentador de Jornal";
		Bonner.entrevistar();
		System.out.println("Informações: " + Bonner.nome + " | " + Bonner.Idade + " | " + Bonner.formacao + " | "
				+ Bonner.areaAtuacao + " | " + Bonner.reportagensPublicadas);

		System.out.println("===================================================================");

		Jornalista Fatima = new Jornalista();
		Fatima.nome = "Fátima Bernardes";
		Fatima.Idade = 62;
		Fatima.areaAtuacao = "Apresentadora";
		Fatima.formacao.add("Lorem");
		Fatima.reportagensPublicadas.add("Ipsum Lorem");
		Fatima.buscar();
		System.out.println("Informações: " + Fatima.nome + " | " + Fatima.Idade + " | " + Fatima.formacao + " | "
				+ Fatima.areaAtuacao + " | " + Fatima.reportagensPublicadas);

		System.out.println("===================================================================");

		Atleta Medina = new Atleta();
		Medina.nome = "Gabriel Medina";
		Medina.idade = 31;
		Medina.modalidade = "Surf";
		Medina.patrocinadores.add("Algum aí");
		Medina.premios.add("Mundial de Surf de 2000 e blá blá");
		Medina.competir();
		System.out.println("Informações: " + Medina.nome + " | " + Medina.idade + " | " + Medina.modalidade + " | "
				+ Medina.premios + " | " + Medina.patrocinadores);

		System.out.println("===================================================================");

		Atleta Anderson_Silva = new Atleta();
		Anderson_Silva.nome = "Anderson Silva";
		Anderson_Silva.idade = 50;
		Anderson_Silva.modalidade = "MMA";
		Anderson_Silva.patrocinadores.add("Oswaldo");
		Anderson_Silva.premios.add("Campeão peso médio UFC");
		Anderson_Silva.treinar();
		System.out.println("Informações: " + Anderson_Silva.nome + " | " + Anderson_Silva.idade + " | "
				+ Anderson_Silva.modalidade + " | " + Anderson_Silva.premios + " | " + Anderson_Silva.patrocinadores);

		System.out.println("===================================================================");

		Politico Bolsonaro = new Politico();
		Bolsonaro.nome = "Jair Bolsonaro";
		Bolsonaro.idade = 70;
		Bolsonaro.mandato = "4 anos";
		Bolsonaro.cargo = "Presidente";
		Bolsonaro.partido = "PL";
		Bolsonaro.debater();

		System.out.println("Informações: " + Bolsonaro.nome + " | " + Bolsonaro.idade + " | " + Bolsonaro.mandato
				+ " | " + Bolsonaro.cargo + " | " + Bolsonaro.partido);

		System.out.println("===================================================================");

		Politico Lula = new Politico();
		Lula.nome = "Lula";
		Lula.idade = 79;
		Lula.mandato = "4 anos";
		Lula.cargo = "Presidente";
		Lula.partido = "PT";
		Lula.proporLeis();
		System.out.println("Informações: " + Lula.nome + " | " + Lula.idade + " | " + Lula.mandato + " | " + Lula.cargo
				+ " | " + Lula.partido);

		System.out.println("===================================================================");

		Programador Guanabara = new Programador();
		Guanabara.nome = "Gustavo Guanabara";
		Guanabara.idade = 47;
		Guanabara.areaAtuacao = "Professor da área de TI";
		Guanabara.formacao = "Alguma aí";
		Guanabara.projetosDesenvolvidos.add("Curso em Vídeo");
		Guanabara.programar();

		System.out.println("Informações: " + Guanabara.nome + " | " + Guanabara.idade + " | " + Guanabara.areaAtuacao
				+ " | " + Guanabara.formacao + " | " + Guanabara.projetosDesenvolvidos);

		System.out.println("===================================================================");

		Programador Andre_Young = new Programador();
		Andre_Young.nome = "André Young";
		Andre_Young.idade = 31;
		Andre_Young.areaAtuacao = "Dev de Jogos";
		Andre_Young.formacao = "Cosme vidro";
		Andre_Young.projetosDesenvolvidos.add("Seraph's Last Stand");
		Andre_Young.corrigirProblemas();

		System.out.println("Informações: " + Andre_Young.nome + " | " + Andre_Young.idade + " | "
				+ Andre_Young.areaAtuacao + " | " + Andre_Young.formacao + " | " + Andre_Young.projetosDesenvolvidos);
	}

}
