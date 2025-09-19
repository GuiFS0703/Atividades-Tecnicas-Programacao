package br.com.fatecpg.tecProg.view;

import br.com.fatecpg.tecProg.model.*;

public class Main {

	public static void main(String[] args) {
		VideoLocadora a = new VideoLocadora(10);
		// Testando setters:

		a.setFilmes("AAA", 0);
		a.setPrecosLocacao(1.55, 0);
		a.setVezesAlugado(10, 0);
		a.setFilmes("BBB", 1);
		a.setPrecosLocacao(12.55, 1);
		a.setVezesAlugado(3, 1);
		a.setFilmes("CCC", 2);
		a.setPrecosLocacao(11.55, 2);
		a.setVezesAlugado(5, 2);
		System.out.println("======================================================================");
		
		a.listarFilmes();
		
		a.faturamentoTotal();
		
		a.filmeMaisAlugado();
		
		a.alugarFilme(0);
		a.devolverFilme(3);
	}

}
