package entidades;

public class Editora {
	private String nomeFantasia, razaoSocial, cnpj;

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setCnpj(String cnpj) {
		if (cnpj.length() < 17) {
			System.out.println("Cnpj inválido!");
		} else {
			this.cnpj = cnpj;
		}
	}

}
