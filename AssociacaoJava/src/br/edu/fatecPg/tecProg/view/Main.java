package br.edu.fatecPg.tecProg.view;

import java.util.ArrayList;
import java.util.List;

import br.edu.fatecPg.tecProg.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Endereco end = new Endereco("Rua 123", "10000000", "12B");
//		Pessoa ale = new Pessoa("Alê", "5477770980", "12", 20, end);
//		System.out.println(ale);
//
//		Aluno joao = new Aluno("Joao", "10987", 20);
//		Disciplina TP = new Disciplina("TP", "DSM", "2/2", joao);
//		System.out.println("================================================================================");
//		System.out.println(TP);
//
//		Cupom cup = new Cupom("1", 12.89);
//		Compra compra = new Compra("Pao", 22);
//		System.out.println("================================================================================");
//		System.out.println("Resultado compra: " + compra.finalizarCompra(cup));
//		System.out.println(compra);

		List<Object> Amostradinho = new ArrayList<>(); // type object é genérico
		Amostradinho.add(1);
		Amostradinho.add("Ale");
		Amostradinho.add('a');
		System.out.println(Amostradinho);

		List<String> nomes = new ArrayList<>();
		nomes.add("Alê");
		nomes.add("Oswaldo");
		nomes.add("Mario");
		nomes.add(1, "Maria"); // especificando índice
		System.out.println(nomes);
		for (String nome : nomes) {
			if (nome.trim().length() <= 3) {
				System.out.println(nome);
			} else {
		
				System.out.println("Nome maior que 3 caracteres: " + nome);
			}
		}

		Aluno a1 = new Aluno("Alê", "12345", 20);
		Aluno a2 = new Aluno("Joao", "12346", 21);
		Aluno a3 = new Aluno("Pedro", "54321", 30);
		Aluno a4 = new Aluno("Milena", "00001", 999999999);

		List<Aluno> alunos = new ArrayList<>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		for (Aluno aluno : alunos) {
			if(aluno.getIdade() >=25 ) {
				System.out.println(aluno);
			} else {
				System.out.println("Alunos - 25 anos: " + aluno);
			}
		}
	}

}
