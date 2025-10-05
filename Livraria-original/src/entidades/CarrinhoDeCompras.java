package entidades;

import java.util.Arrays;

public class CarrinhoDeCompras {
	private double total = 0;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;

	public void adicionar(Produto produto) { // funciona pelos dois serem filhos do livro
		System.out.println("Livro add: " + produto);
		this.produtos[contador] = produto;
		total += produto.getValor();
		contador++;
	}

	public double getTotal() {
		return total;
	}

	public Produto[] getProdutos() {
		return Arrays.copyOf(produtos, produtos.length); // retornamos uma copia para n permitir o acesso a referencia
															// do original
	}

}
