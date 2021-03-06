package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import entities.Aluno;
import entities.Media;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Media m1 = new Media().adicionar(8.3).adicionar(6.7);
		Media m2 = new Media().adicionar(4.3).adicionar(6.7);
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
		
		System.out.println(Media.combinar(m1, m2).getValor());
		
		Aluno a1 = new Aluno("Ana", 4.7);
		Aluno a2 = new Aluno("Gabi", 7.7);
		Aluno a3 = new Aluno("Joao", 2.7);
		Aluno a4 = new Aluno("Gui", 8.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> soNota = a -> a.nota;
		
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinarMedia = (me1, me2) -> Media.combinar(m1, m2);
		
		Media media = alunos.stream().filter(aprovado).map(soNota).reduce(new Media(), calcularMedia, combinarMedia);
		System.out.println("A media " + media.getValor());
	}

}
