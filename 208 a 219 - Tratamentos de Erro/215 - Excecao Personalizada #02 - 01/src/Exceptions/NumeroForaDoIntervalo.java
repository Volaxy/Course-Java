package Exceptions;

@SuppressWarnings("serial")
public class NumeroForaDoIntervalo extends Exception {
	
	private String nomeDoAtributo;
	
	public NumeroForaDoIntervalo(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s esta fora do intervalo", nomeDoAtributo);
	}
	
}
