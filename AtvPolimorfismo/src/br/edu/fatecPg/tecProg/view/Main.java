package br.edu.fatecPg.tecProg.view;

import br.edu.fatecPg.tecProg.model.*;

public class Main {

	public static void main(String[] args) {
		Calculadora calculos = new Calculadora();
		System.out.println("Primeiro método: " + calculos.somar(5, 3));
		System.out.println("Segundo método: " + calculos.somar(4, 2, 1));
		System.out.println("Terceiro método: " + calculos.somar(5, 2));
		// Sobrecarga é o ato de criar várias versões de um mesmo método justamente para
		// possibilitar variações de estrutura e comportamentos, permitindo abranger
		// diferentes cenários

		// Pergunta: Descreva mecanismos de sobrecarga de métodos e como ele difere da
		// sobrescrita em termo de polimorfismo
		// Por a sobrecarga permitir ter variações do mesmo método, ele mostra mais
		// possibilidades de cenários. Sobrescrita simplesmente substitui o método
		// herdado, limitando a abrangência de cenários.

		Produto pao = new Produto("Pão");
		Produto pizza = new Produto("Pizza", 3);
		Produto feijao = new Produto("Feijão", 5, 15);
		// Discuta como a sobrecarga de construtores facilita a criação de objetos com
		// diferentes conjuntos de informações, permitindo flexibilidade na instânciação
		// de objetos

		System.out.println("======================");

		// Ele facilita a criação de objetos pq dá mais opções para a criação de
		// objetos, ué
		PagamentoCartao cartao = new PagamentoCartao();
		PagamentoBoleto boleto = new PagamentoBoleto();
		cartao.processarPagamento();
		boleto.processarPagamento();
		// Sobrescrita é muito útil em situações que subclasses que herdam de uma mesma
		// super consigam ter diferentes comportamentos, possibilitando classes que não
		// são 100% iguais de herdarem de uma mesma super

		Conversor conversor = new Conversor();
		System.out.println("Conversão de Celcius pra Fahrenheit: " + conversor.converter(10));
		System.out.println("Conversão de KM para milhas: " + conversor.converter(9.87));
		System.out.println("Convertendo String para letras maiúsculas: " + conversor.converter("aaa2ff3F"));
		// Sobrecarga consegue ter vários métodos com mesmo nome pq eles tem retorno e
		// parâmetros diferentes, sendo considerados métodos diferentes mesmo com o
		// mesmo nome
	}
}
