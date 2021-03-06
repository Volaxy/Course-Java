package application;

import java.util.function.UnaryOperator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> maisDois = x -> x + 2;
		UnaryOperator<Integer> vezesDois = x -> x * 2;
		
		System.out.println(maisDois.andThen(vezesDois).andThen(maisDois).apply(3));
		
		System.out.println(vezesDois.compose(maisDois).apply(0));
	}

}
