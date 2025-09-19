package entidades;

public class Ebook extends Livro implements Promocional {

	public Ebook(Autor autor) {
		super(autor); // super é usado para chamar o constructor da classe pai
	}

	private String waterMark;

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	@Override

	public void aplicarDesconto(double desconto) {
		if (desconto > 0.15) {
			System.out.println("Valor acima do permitido!");
		} else {
			double valor = this.getValor();
			this.setValor(valor -= valor * desconto);
		}
	}
}
