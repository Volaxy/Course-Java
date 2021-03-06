package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno("Ana", 5.7);
		Aluno a2 = new Aluno("Pedro", 9.7);
		Aluno a3 = new Aluno("Maria", 1.7);
		Aluno a4 = new Aluno("Bernado", 8.0);
		Aluno a5 = new Aluno("Joao", 2.9);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> parabens = a -> "Parabens " + a.nome + "!!!";
		
		alunos.stream().filter(aprovado).map(parabens).forEach(System.out::println);
	}

}
