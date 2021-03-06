package application;

import Exceptions.NumeroForaDoIntervalo;
import Exceptions.StringVazia;
import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Aluno aluno = new Aluno("Ana", 7);
			
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVazia e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaDoIntervalo e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}

}
