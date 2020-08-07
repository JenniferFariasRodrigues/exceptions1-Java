package model.exceptions;

//RunTImeException tipo de excecao que o compilador nao 
//obriga a tratar. Se colocar exception,sua excecao
//o compilador vai obrigar a tratar.
public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		//Repassa mensagem para o construtor da super classe.
		super(msg);
	}
}