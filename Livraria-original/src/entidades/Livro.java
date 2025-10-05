package entidades;

import exception.*;

public abstract class Livro implements Produto { // classes abstracts são usadas como molde para outras subclasses,
													// impedindo
	// instanciação dela.
	private String nome, isbn, descricao;
	private double valor = 0;
	private Autor autor = new Autor();

	/* Constructor */
	public Livro(Autor autor) { // parâmetros definidos no constructor são obrigatórios na criação do objeto.
		if (autor == null) { // uso excessões em casos mt específicos e primordiais. Neste caso, é
								// importantíssimo ter um autor na criação do livro. O objeto n terá sentido sem
								// ele.
			throw new AutorNuloException("Não é permitido atores nulos!");
		} else {
			this.autor = autor;
			this.isbn = "000-00-00000-00-0"; // isbn demora pra ser criado num livro. Portanto, adicionamos um valor
												// padrão.
		}
	}

	/* Getters: */
	public double getValor() {
		return this.valor;
	}

	public String getNome() {
		return this.nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getDescricao() {
		return descricao;
	}

	public Autor getAutor() {
		return new Autor(this.autor); // retornando uma nova referência de objeto
	}

	/* Setters: */
	public void setValor(double valor) {
		System.out.println("--");
		if (valor <= 0) {
			System.out.println("Só são permitidos vender com valores positivos, obviamente.");
		} else {
			this.valor = valor;
			System.out.println("Valor adicionado com sucesso!");
		}
		System.out.println("--");
	}

	public void setIsbn(String isbn) {
		if (isbn.length() >= 13 && isbn.length() <= 17) {
			this.isbn = isbn;
		} else {
			System.out.println("Código inválido!");
		}
	}

	public void setDescricao(String descricao) {
		if (descricao.length() > 0) {
			this.descricao = descricao;
		} else {
			System.out.println("Digite algo!");
		}
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void setNome(String nome) {
		if (nome.length() <= 2) {
			System.out.println("Aceitamos nomes a partir de dois caracteres!");
		} else {
			this.nome = nome;
		}
	}

	@Override

	public String toString() {
		return String.format("Nome: %s | Descrição: %s | Preço: %s | ISBN: %s | %s",
				(this.nome != null) ? this.nome : "N/A", (this.descricao != null) ? this.descricao : "Sem descrição",
				(this.valor != 0) ? String.format("R$%.2f", this.valor) : "Valor indefinido", this.isbn, this.autor);
	}
}
