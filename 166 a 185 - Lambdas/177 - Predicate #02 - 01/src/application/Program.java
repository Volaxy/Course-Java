package application;

import java.util.function.Predicate;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isPar = x -> x % 2 == 0;
		Predicate<Integer> is3 = x -> x / 100 >= 1;
		
		System.out.println(isPar.test(32));
		System.out.println(is3.test(147));
		System.out.println(is3.test(97));
		System.out.println(isPar.and(is3).negate().test(30));
		System.out.println(isPar.or(is3).test(29));
	}

}
