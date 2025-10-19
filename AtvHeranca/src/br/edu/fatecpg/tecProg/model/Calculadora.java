package br.edu.fatecpg.tecProg.model;

public class Calculadora implements IoperacaoMatematica {

	@Override
	public double somar(double vl1, double vl2) {
		return vl1 + vl2;
	};

	public double subtrair(double vl1, double vl2) {
		return vl1 - vl2;
	};

	public double dividir(double vl1, double vl2) {
		if (vl1 != 0 && vl2 != 0) {
			return vl1 / vl2;
		} else {
			return 0000;
		}
	};

	public double multiplicar(double vl1, double vl2) {
		return vl1 * vl2;
	};
}
