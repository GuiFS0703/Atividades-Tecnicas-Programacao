package br.com.atv01.ex04;

import java.text.DecimalFormat;

public class Ex04 {
	public static void calcularTabuada(double vl) {
		DecimalFormat formatar = new DecimalFormat("#.0");
		for (int i = 1; i <= 10; i++) {
			System.out.println(vl + " x " + i + " = " + formatar.format(vl * i));
		}
	}
}
