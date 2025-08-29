package br.com.atv01.ex03;

import java.util.Scanner;

public class Ex03 {

	public static double menuEx03(String op) {
		double resultado, vl;
		Scanner scan = new Scanner(System.in); // criando um objeto de scan
		switch (op) {
		case "1":
			System.out.println("Digite o valor do lado do triângulo: ");
			vl = scan.nextDouble();
			if (vl <= 0) {
				return -999999999;
			} else {
				resultado = vl * vl;
				return resultado;
			}
		case "2":
			System.out.println("Digite o valor do raio do círculo: ");
			vl = scan.nextDouble();
			if (vl <= 0) {
				return -999999999;
			} else {
				resultado = (vl * vl) * 3.14159;
				return resultado;
			}

		default:
			return -999999999;
		}
	}
}