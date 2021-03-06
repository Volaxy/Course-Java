package application;

import java.util.function.Function;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, String> function1 = x -> x % 2 == 0 ? "par" : "impar";
		
		function1.apply(5);
		
		Function<String, String> function2 = x -> "O resultado e " + x;
		
		Function<String, String> function3 = x -> x + "!!!";
		
		String resutado = function1.andThen(function2).andThen(function3).apply(32);
		System.out.println(resutado);
	}

}
