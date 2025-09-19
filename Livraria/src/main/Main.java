package main;

import entidades.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * Autor autor = new Autor(); autor.setCpfAutor("456.566.567-01");
		 * autor.setNmAutor("Joao"); autor.setEmailAutor("joao@gmail.com"); LivroFisico
		 * livro = new LivroFisico(autor); livro.setNome("João e o pé de feijão");
		 * livro.setDescricao("Este livro é baseado em....");
		 * livro.setIsbn("978-3-16-148410-0"); livro.setValor(123.50);
		 * livro.aplicarDesconto(0.5); Ebook ebook = new Ebook(autor);
		 * ebook.setNome("Marcio"); ebook.setDescricao("Uma merda");
		 * ebook.setIsbn("878-2-12-123459-0"); ebook.setValor(12);
		 * ebook.setWaterMark(null); CarrinhoDeCompras carrinho = new
		 * CarrinhoDeCompras(); carrinho.adicionar(ebook); carrinho.adicionar(livro);
		 * Produto[] produtin = carrinho.getProdutos();
		 * System.out.println("Inicializando loop: "); for (int i = 0; i <
		 * produtin.length; i++) { if (produtin[i] == null) { break; } else {
		 * System.out.println("Produto: " + produtin[i]); } }
		 * System.out.println("Total pago: " + carrinho.getTotal());
		 */
		Autor autorzin = new Autor();
		Ebook ebookzin = new Ebook(autorzin);
		System.out.println(ebookzin); //chama toString
	} // page 171

}
