package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia");
		
		System.out.println(umaLista.get());
	}

}
