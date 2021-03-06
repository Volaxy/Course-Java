package application;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		} catch(Exception e) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Erro: " + e.getMessage());;
		}
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}
