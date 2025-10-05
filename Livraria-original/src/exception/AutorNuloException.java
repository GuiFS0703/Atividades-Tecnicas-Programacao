package exception;

public class AutorNuloException extends RuntimeException {
	public AutorNuloException(String mensagem) {
		super(mensagem); //chama o constructor pai para executar a mensagem
	}
}
