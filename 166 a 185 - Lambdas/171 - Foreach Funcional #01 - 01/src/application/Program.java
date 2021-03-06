package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");
		
		System.out.println("Forma tradicional");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("Lambda");
		aprovados.forEach(nome -> System.out.println(nome));
		
		System.out.println("Method reference");
		aprovados.forEach(System.out::println);
	}

}
