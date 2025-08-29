package br.com.atv01.ex08;

public class Ex08 {
	public static void calcularImpares(int impares) {
		int somatoria = 0;
		if (impares <= 0) {
			System.out.println("Número inválido!");
		} else {
			for (int i = 1; i <= (impares * 2); i++) {
				if (i % 2 != 0) {
					somatoria += i;
					System.out.println("Ímpar add: " + i);
				}
			}
			System.out.println("Somatória total: " + somatoria);
		}
	}
}
