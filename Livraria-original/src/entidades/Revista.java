package entidades;

public class Revista implements Produto, Promocional{
	private String nome, descricao;
	private double valor;
	private Editora editora;

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public void aplicarDesconto(double vlDesconto) {
		if (vlDesconto > 0.1) {
			System.out.println("Não permitido descontos a partir de 10%.");
		} else {
			double desconto = this.getValor() * vlDesconto;
			this.setValor(this.getValor() - desconto);
		}
	}
}
