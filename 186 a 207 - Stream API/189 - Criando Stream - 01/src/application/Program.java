package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> print = System.out::print;
		//Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS \n");
		langs.forEach(print);
		
		
		
		String[] maisLangs = {"Python ", "C ", "Perl \n"};
		
		Stream.of(maisLangs).forEach(print);
		
		
		
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		
		
//		Stream.generate(() -> "a").forEach(print);;
//		Stream.iterate(0, n -> n + 1).forEach(println);
		
		Stream<Double> values = Stream.of(1.5, 2.0);
		Consumer<Double> mult = x -> {
			System.out.println(x * 2);
		};
		
		values.forEach(mult);
	}

}
