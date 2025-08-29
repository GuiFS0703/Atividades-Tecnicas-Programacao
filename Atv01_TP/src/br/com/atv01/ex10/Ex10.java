package br.com.atv01.ex10;

import java.util.Scanner;
import java.util.UUID; //biblioteca de ids

public class Ex10 {

	public static void adivinharSenha() { // gera id aleatório
		String senha = UUID.randomUUID().toString().substring(0, 8);
		String tentativaSenha;
		Scanner scan = new Scanner(System.in);
		do {
			// System.out.println("Senha: " + senha); Se quiser verificar...
			System.out.println("Insira a sua senha: ");
			tentativaSenha = scan.next();
			if (!tentativaSenha.equals(senha)) {
				System.out.println("Tente novamente!");
			} else {
				System.out.println("Acertou!!! Senha: " + senha);
			}
		} while (!tentativaSenha.equals(senha));
	}
}
