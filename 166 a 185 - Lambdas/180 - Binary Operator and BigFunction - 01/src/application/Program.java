package application;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Double> avg = (n1, n2) -> (n1 + n2) / 2;
		
		System.out.println(avg.apply(1.0, 2.0));
		
		BiFunction<Double, Double, String> result = (n1, n2) -> {	
			return ((n1 + n2) / 2) >= 7 ? "aprovado" : "reprovado";
		};
		
		System.out.println(result.apply(2.0, 5.0));
		
		Function<Double, String> conceito = m -> m >= 7 ? "aprovado" : "reprovado";
		
		System.out.println(conceito.apply(3.5));
		
		System.out.println(avg.andThen(conceito).apply(7.0, 9.0));
	}

}
