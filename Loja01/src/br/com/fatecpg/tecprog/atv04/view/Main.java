package br.com.fatecpg.tecprog.atv04.view;

import br.com.fatecpg.tecprog.atv04.model.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Loja Havan = new Loja(10);
		Boolean verif;
		Scanner scan = new Scanner(System.in);
		String nome, resp;
		double vl;
		int i, qtd;

		do {
			System.out.println("Insira o nome do produto: "); // entendi agora. Os nexts normais pegam só tudo antes do
																// espaço, mas o nextLine pega tudo. Portanto, ele pega
																// o espaço do next anterior e acaba pulando o syso.
			nome = scan.nextLine(); // pega uma linha inteira, independente de espaço ou n
			System.out.println("Insira o índice aonde o produto será armazenado: ");
			i = Integer.parseInt(scan.nextLine());
			System.out.println("Insira a quantidade do produto: ");
			qtd = Integer.parseInt(scan.nextLine());
			System.out.println("Insira, por fim, o valor unitário do produto: ");
			vl = Double.parseDouble(scan.nextLine());
			verif = Havan.inserirProduto(nome, i, vl, qtd);
			System.out.println("Deseja inserir mais? Diga 'S' ou 'N': ");
			resp = scan.nextLine();
		} while (verif == false || resp.toUpperCase().equals("S"));
		Havan.exibirProdutos();
		scan.close();
		System.out.println("=======================================================");
		Havan.getMaiorMenorProduto();
		System.out.println("Valor do estoque: " + Havan.calcularVlEstoque());
		System.out.println("=======================================================");
		System.out.println("Comprando produto.......");
		Havan.comprarProduto(1, 2);
		
		
	}
}
