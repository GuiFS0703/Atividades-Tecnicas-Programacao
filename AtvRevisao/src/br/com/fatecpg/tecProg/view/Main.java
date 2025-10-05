package br.com.fatecpg.tecProg.view;

import java.util.Scanner;
import br.com.fatecpg.tecProg.model.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/** PROVA TIPO A: **/

		/* Carro: */

		/*
		 * Carro eclipse = new Carro(); eclipse.modelo = "Eclipse Gst"; eclipse.ano =
		 * 1995; eclipse.marca = "Mitsubishi"; System.out.println( "Marca: " +
		 * eclipse.marca + " | " + "Modelo: " + eclipse.modelo + " | " + "Ano: " +
		 * eclipse.ano);
		 */

		/* Aluno */

		/*
		 * Aluno eu = new Aluno(); eu.setMatricula(true); eu.setNome("Eu");
		 * eu.setNotaFinal(9.5);
		 * 
		 * System.out.println("Nome: " + eu.getNome() + " | " + "Matricula: " +
		 * eu.getMatricula() + " | " + "Nota: " + eu.getNotaFinal());
		 */

		/* Farmácia: */

		Farmacia Drogasil = new Farmacia(3);
		for (int i = 0; i < Drogasil.getDiasParaVencimento().length; i++) {
			String nome;
			int dias;
			double preco;
			System.out.println("Digite um produto nº" + (i + 1) + ": ");
			nome = scan.nextLine(); // captura quebra de linha, diferente do next normal.
			System.out.println("Digite a dias para o vencimento deste produto: ");
			dias = Integer.parseInt(scan.nextLine());
			System.out.println("Digite o preço deste produto: ");
			preco = Double.parseDouble(scan.nextLine()); // coloco em todos para o nextLine n pegar a quebra de linha do
															// outro.
			Drogasil.inserirMedicamento(nome, dias, preco, i);
		}
		Drogasil.mostrarMedicamentos();
		Drogasil.mediaVencimentoRemedio();
		Drogasil.exibirRemediosProxVencimento();
		Drogasil.aplicadorAutomaticoDesconto();
		Drogasil.venderMedicamento(1);
		
		
		/* PROVA TIPO B: */

		/* Livro: */

		/*
		 * Livro Hobbits = new Livro(); Hobbits.titulo = "O Hobbit"; Hobbits.autor =
		 * "J.R.R Tolkien"; Hobbits.anoPublicacao = 1937;
		 * 
		 * System.out.println("Nome: " + Hobbits.titulo + " | " + "Autor: " +
		 * Hobbits.autor + " | " + "Ano: " + Hobbits.anoPublicacao);
		 */

		/* Funcionário: */

		/*
		 * Funcionario CLT = new Funcionario(); CLT.setNome("Oswaldo");
		 * CLT.setCargo("Dev backend"); CLT.setSalario(7777777); // pobre ele kkkkk
		 * 
		 * System.out.println("Nome: " + CLT.getNome() + " | " + "Cargo: " +
		 * CLT.getCargo() + " | " + "Salário: R$" + CLT.getSalario());
		 */

		/* Supermercado: */

		/* PROVA TIPO C: */

		/* Celular: */

		/*
		 * Celular nokia = new Celular(); nokia.marca = "Nokia"; nokia.modelo = "1110";
		 * nokia.preco = 69;
		 * 
		 * System.out .println("Nome: " + nokia.marca + " | " + "Modelo: " +
		 * nokia.modelo + " | " + "Preço: " + nokia.preco);
		 */

		/* Conta bancária: */

		/*
		 * ContaBancaria minhaConta = new ContaBancaria(); minhaConta.setTitular("EU");
		 * minhaConta.setNumeroConta(1); minhaConta.setSaldo(1000000);
		 * System.out.println("Titular: " + minhaConta.getTitular() + " | " +
		 * "Número da conta: " + minhaConta.getNumeroConta() + " | " + "Saldo: " +
		 * minhaConta.getSaldo());
		 */

		/**/
	}
}
