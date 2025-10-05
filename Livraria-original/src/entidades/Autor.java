package entidades;

import java.util.Objects;

public class Autor {
	private String nmAutor, emailAutor, cpfAutor;

	public Autor(Autor autor) { // quando formos retornar uma copia do original
		this.nmAutor = autor.getNmAutor();
		this.emailAutor = autor.getEmailAutor();
		this.cpfAutor = autor.getCpfAutor();
	}

	public Autor() { // quando formos iniciar um objeto qualquer.

	}

	public String getNmAutor() {
		return nmAutor;
	}

	public String getEmailAutor() {
		return emailAutor;
	}

	public String getCpfAutor() {
		return cpfAutor;
	}

	public void setNmAutor(String nmAutor) {
		if (nmAutor.length() > 0) {
			this.nmAutor = nmAutor;
		} else {
			System.out.println("Digite um nome válido!");
		}
	}

	public void setEmailAutor(String emailAutor) {
		int posicao = emailAutor.indexOf("@");
		if (posicao == -1) {
			System.out.println("Envie um email válido!");
		} else {
			this.emailAutor = emailAutor;
		}
	}

	public void setCpfAutor(String cpfAutor) {
		if (cpfAutor.length() == 14) {
			this.cpfAutor = cpfAutor;
		} else {
			System.out.println("CPF inválido!");
		}
	}

	@Override

	public String toString() {
		return String.format("Autor: %s ", this.nmAutor == null ? "Nome não definido" : this.nmAutor);
	}
 //recebo em Object para conseguir receber qualquer classe neste método
	public boolean equals(Object obj) { // método de comparar propriedades internas do obj
		if (this == obj) { // objetos iguais
			return true;
		} else if (obj != null && obj.getClass() == getClass()) {
			Autor autor = (Autor) obj; // usando casting para converter o obj para obj Autor
			return Objects.equals(this.nmAutor, autor.nmAutor);
		} else {
			return false;
		}
	}
}
