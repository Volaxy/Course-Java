package application;

import Exceptions.NumeroForaDoIntervalo;
import Exceptions.StringVazia;
import entities.Aluno;

public class Validar {
	
	private Validar() {}
	
	public static void aluno(Aluno aluno) throws StringVazia, NumeroForaDoIntervalo {
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno esta nulo");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVazia("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaDoIntervalo("nota");
		}
	}
	
}
