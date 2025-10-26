package br.edu.fatecPg.tecProg.model;

public class Conversor {
	public double converter(double celcius) {
		return (celcius * 1.8) + 32;
	}

	public float converter(float km) {
		return km * 0.621371f;
	}

	public String converter(String texto) {
		return texto.toUpperCase();
	}
}
