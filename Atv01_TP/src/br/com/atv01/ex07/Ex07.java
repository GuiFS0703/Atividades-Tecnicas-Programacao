package br.com.atv01.ex07;

public class Ex07 {
	public static String verifIdade(int idade) {
		if (idade <= 0 || idade > 120) {
			return "Idade inválida!";
		} else if (idade < 18) {
			return "Essa pessoa é menor de idade!";
		} else if (idade < 60) {
			return "Essa pessoa é adulta!";
		} else {
			return "Essa pessoa é idosa!";
		}
	}
}
