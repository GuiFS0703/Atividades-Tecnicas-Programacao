package br.edu.fatecpg.tecProg.model;

public interface Iautenticavel {
	boolean login(String user, String senha);

	void logout();

}
