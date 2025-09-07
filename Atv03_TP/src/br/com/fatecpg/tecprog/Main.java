package br.com.fatecpg.tecprog;

import br.com.fatecpg.tecprog.model.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("================================================");
		System.out.println("Informações da conta: ");
		ContaBancaria minhaConta = new ContaBancaria("Oswaldo");
		minhaConta.depositarSaldo(150);
		System.out.println("Titular: " + minhaConta.getTitular() + " | " + minhaConta.getSaldo());
		Carro eclipse = new Carro("Mitsubishi Eclipse", 50, minhaConta);
		eclipse.setCor("Vermelho");
		eclipse.setAno(1995);
		System.out.println("================================================");
		System.out.println("Informações do produto: ");
		Produto meuProduto = new Produto();
		meuProduto.setNome("Coxinha");
		meuProduto.setPreco(6.5);
		meuProduto.setQt_estoque(15);
		System.out.println(meuProduto.getNome() + " | R$" + meuProduto.getPreco() + " | " + meuProduto.getQt_estoque());
		System.out.println("================================================");

		System.out.println("Informações do carro: ");
		System.out.println("Informações do carro: " + eclipse.getModelo() + " | " + eclipse.getAno() + " | "
				+ eclipse.getCor() + " | " + eclipse.getCapacidade_tanque() + " | " + eclipse.getQt_gasolina());
		System.out.println("================================================");
		System.out.println("Ações do carro: ");

		eclipse.acelerarCarro();
		eclipse.frearCarro();
		eclipse.desligarCarro();
		System.out.println("================================================");
		System.out.println("Interação de abastecer: ");
		System.out.println("Tentando abastecer carro: ");
	    double vl = eclipse.calcularVlTanque(6.50, 24);
		if(vl!=0) {
			System.out.println("Valor total da operação: R$" + vl);
		}
	    System.out.println("Saldo após a compra: R$" + minhaConta.getSaldo());
		System.out.println("================================================");
		System.out.println("Interação de comprar produto: ");
		minhaConta.depositarSaldo(200);
		minhaConta.sacarValor(meuProduto.getPreco() * 5);
		meuProduto.setQt_estoque(-5);
		System.out.println("Comprei coxinhas e meu saldo ficou: R$" + minhaConta.getSaldo());
		System.out.println("Estoque de coxinhas: " + meuProduto.getQt_estoque());
	}

}
