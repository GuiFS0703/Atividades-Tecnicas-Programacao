package br.com.atv01;

import java.text.DecimalFormat;
import java.util.Scanner;

import br.com.atv01.ex01.Ex01;
import br.com.atv01.ex02.Ex02;
import br.com.atv01.ex03.Ex03;
import br.com.atv01.ex04.Ex04;
import br.com.atv01.ex05.Ex05;
import br.com.atv01.ex06.Ex06;
import br.com.atv01.ex07.Ex07;
import br.com.atv01.ex08.Ex08;
import br.com.atv01.ex09.Ex09;
import br.com.atv01.ex10.Ex10;

public class Main {

	public static void main(String[] args) {
		String op, resp;
		Scanner scan = new Scanner(System.in); // objeto de composição da class System, responsável pela entrada de
		DecimalFormat formatar = new DecimalFormat("#.00"); // classe que formata baseado na qt de casas decimais após a
															// virgola.
		// dados do user ( normalmente do teclado )
		Boolean repetir;
		do {
			repetir = false;
			System.out.println("Digite o número do exercício que deseja verificar: ");
			op = scan.next();
			switch (op) {
			case "1":
				double num;
				System.out.println("Digite um número: ");
				num = scan.nextDouble();
				System.out.println("Resultado: " + Ex01.verificarPositividade(num));
				break;

			case "2":
				int num1, num2;
				System.out.println("Digite um número inteiro: ");
				num1 = scan.nextInt();
				System.out.println("Digite um segundo número: ");
				num2 = scan.nextInt();
				System.out.println("Resposta: " + Ex02.comparadorNumeros(num1, num2));
				break;

			case "3":
				String menuOp;
				System.out.println(
						"Bem-vindo ao menu! Digite '1' para calcular a área do quadrado e '2' para a de um círculo: ");
				menuOp = scan.next();
				double resu = Ex03.menuEx03(menuOp);
				if (resu == -999999999) {
					System.out.println("Valor inválido!");
				} else {
					System.out.println("Resultado: " + formatar.format(resu) + "cm²");
				}
				break;

			case "4":
				double vl;
				System.out.println("Tabuada!!!");
				System.out.println("Digite um valor que será multiplicado: ");
				vl = scan.nextDouble();
				Ex04.calcularTabuada(vl);
				break;

			case "5":
				int inteiro;
				System.out.println("Digite um valor: ");
				inteiro = scan.nextInt();
				System.out.println("Resultado: " + Ex05.verificarPar(inteiro));
				break;

			case "6":
				int fatorial;
				System.out.println("Digite o valor a ser calculado em fatorial: ");
				fatorial = scan.nextInt();
				Ex06.fatorial(fatorial);
				break;

			case "7":
				int idade;
				System.out.println("Digite sua idade: ");
				idade = scan.nextInt();
				System.out.println("Resposta: " + Ex07.verifIdade(idade));
				break;

			case "8":
				System.out.println("Somatória de Ímpares!");
				System.out.println("Digite a quantidade de ímpares que deseja somar: ");
				Ex08.calcularImpares(scan.nextInt());
				break;

			case "9":
				System.out.println("Envie nomes!");
				Ex09.verificarNome();
				break;

			case "10":
				System.out.println("Adivinhe a senha!");
				Ex10.adivinharSenha();
				break;

			default:

				System.out.println("Exercício não encontrado! Tente novamente!");
				repetir = true;
			}
			if (repetir == false) {
				System.out.println("Quer tentar novamente? Digite 'S' para sim e 'N' para não: ");
				resp = scan.next();

				if (resp.toUpperCase().equals("S")) { // equals compara conteúdo de objetos, pois comparação com "=="
														// compara sua referência e não seus valores.
					// String em Java é um objeto, ahahahahahhahaha!!!!!1!!!
					repetir = true;
				}
			}
		} while (repetir == true);
	}

}


//Pensei em colocar try/catch, mas parece que só ia encher o código de +.
//achei uma boa ideia deixar tudo centralizado aqui. Tentei deixar o máximo organizado que pude kkk.