package br.com.atv01.ex09;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex09 {
	
 public static void verificarNome() {
	 List<String> nomes = new ArrayList<>(); //vetor muito mais flexível que arrays
	 String nomeVasculhado;
	 Scanner scan = new Scanner(System.in);
	 for(int i=0; i<5; i++) {
		 System.out.println("Digite um " + (i+1) + "º nome: " );
		 nomes.add(scan.next().toLowerCase());
	 }
	 System.out.println("Agora vem a busca! digite um nome para verificarmos se já foi digitado: ");
	 nomeVasculhado = scan.next().toLowerCase();
	 for (String nome : nomes) { //foreach
		if(nome.equals(nomeVasculhado)) { //são objetos, devo usar equals ( tinha esquecido )
			System.out.println("Nome encontrado: " + nome);
			break;
		}
		System.out.println("Nome listado: " + nome);
	} 
 }
}
