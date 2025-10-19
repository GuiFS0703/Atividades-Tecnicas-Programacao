package br.edu.fatecpg.tecProg.model;

public class SistemaDeSeguranca implements Iautenticavel {
	private String user, senha;
	private boolean login;

	public SistemaDeSeguranca(String user, String senha) {
		if (user != null && !user.trim().isEmpty()) {
			this.user = user;
			this.senha = senha;
			this.login = true;
		} else {
			throw new IllegalArgumentException("Argumentos inválidos!");
		}
	}

	@Override
	public boolean login(String user, String senha) {
		if (this.login == true) {
			System.out.println("User já logado");
			return true;
		} else if (user != null && this.user.equals(user) && senha != null && this.senha.equals(senha)) {
			System.out.println("Login Feito!");
			return true;
		} else {
			System.out.println("Credenciais distintas!");
			return false;
		}
	}

	public void logout() {
		if (this.login == true) {
			System.out.println("Deslogado com sucess!!");
			this.login = false;
		} else {
			System.out.println("User já deslogado!");
		}
	}

}
