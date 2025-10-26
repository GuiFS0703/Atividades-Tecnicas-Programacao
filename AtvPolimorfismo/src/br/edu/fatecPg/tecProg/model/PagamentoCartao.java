package br.edu.fatecPg.tecProg.model;

public class PagamentoCartao extends Pagamento {
	@Override
	public void processarPagamento() {
		System.out.println("Processando pagamento via cartão de crédito");
	}
}
