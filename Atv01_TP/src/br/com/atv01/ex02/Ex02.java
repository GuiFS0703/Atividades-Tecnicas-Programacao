package br.com.atv01.ex02;

public class Ex02 {

	public static String comparadorNumeros(int num1, int num2) {
		if (num1 > num2) {
			return num1 + " é maior que " + num2;
		} else if (num2 > num1) {
			return num2 + " é maior que " + num1;
		} else {
			return num1 + " e " + num2 + " são valores iguais ";
		}
	}
} // n vi necessidade de definir se são iguais ou diferentes nos dois primeiros
	// ifs, pois é meio óbvio.
