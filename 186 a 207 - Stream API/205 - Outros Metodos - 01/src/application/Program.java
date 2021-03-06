package application;

import java.util.Arrays;
import java.util.List;

import entities.Aluno;

public class Program {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 5.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 5.1);
		Aluno a6 = new Aluno("Luna", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Gabi", 10);
		Aluno a9 = new Aluno("Gabi", 10.0);
		Aluno a10 = new Aluno("Sara", 10);
		Aluno a11 = new Aluno("Iara", 9.0);
		Aluno a12 = new Aluno("WJunior", 10);
		Aluno a13 = new Aluno("Paulo", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream().distinct().skip(2).limit(1).forEach(System.out::println);
		
		System.out.println("\nTakeWhile");
		alunos.stream().distinct().skip(2).takeWhile(a -> a.nota >= 7).forEach(System.out::println);
	}
	
}
