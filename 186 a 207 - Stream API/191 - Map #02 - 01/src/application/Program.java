package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import util.utils;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BWN ", "Audi ", "Honda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
//		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//		UnaryOperator<String> grito = n -> n + "!!!";
		
		//System.out.println(maiuscula).andThen(primeiraLetra).andThen(grito).apply("A"));
		marcas.stream().map(utils.maiuscula).map(primeiraLetra).map(utils::grito).forEach(print);
	}

}
