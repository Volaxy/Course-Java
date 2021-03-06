package application;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Luca");
		
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		Iterator<String> iterator = aprovados.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}

}
