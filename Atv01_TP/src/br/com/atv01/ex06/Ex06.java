package br.com.atv01.ex06;

public class Ex06 {

	public static void fatorial(int num) {

		if (num <= 0) {
			System.out.println("Não são permitidos números naturais não inteiros!");
		} else {
			int resu = 1;
			for (int i = 1; i <= num; i++) {
				resu *= i;
			}
			System.out.println("Resultado do fatorial: " + resu);
		}
	}
}
