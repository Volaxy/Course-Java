package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno("Ana", 4.7);
		Aluno a2 = new Aluno("Gabi", 7.7);
		Aluno a3 = new Aluno("Joao", 2.7);
		Aluno a4 = new Aluno("Gui", 8.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> nota = a -> a.nota;
		BinaryOperator<Double> somatoria = (a, b) -> a + b;
		
		alunos.parallelStream().filter(aprovado).map(nota).reduce(somatoria).ifPresent(System.out::println);
	}

}
