package br.com.atv01.ex01;

public class Ex01 { // retorna um tipo
	public static String verificarPositividade(double num) { // métodos static sçao dá própria classe e n precisam de
																// objetos para serem usados
		if (num < 0) {
			return "número negativo!";
		} else if (num > 0) {
			return "Seu número é positivo";
		} else {
			return "Seu número é neutro, ou seja, 0!";
		}
	}

}

//desculpa a quantidade de textos, mas é para explicar o que fiz para n parecer que só catando do gepeto. 