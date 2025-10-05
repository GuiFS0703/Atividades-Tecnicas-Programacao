package entidades;

public class LivroFisico extends Livro implements Promocional {

	public LivroFisico(Autor autor) {
		super(autor);
	}

	public double getTaxaImpressao() {
		return this.getValor() * 0.5;
	}

	@Override
	public void aplicarDesconto(double desconto) {
		System.out.println("Valor atual: " + this.getValor());
		if (desconto > 0.3) {
			System.out.println("Não é permitido descontos acima de 30%!");
		} else {
			double valor = this.getValor();
			this.setValor(valor -= this.getValor() * 0.3);
		}
	}
}
