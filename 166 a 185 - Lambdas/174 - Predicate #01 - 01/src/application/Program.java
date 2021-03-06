package application;

import java.util.function.Predicate;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Produto> isCaro = prod -> prod.preco >= 3000.0;
		
		System.out.println(isCaro.test(new Produto("Notebook", 3500.0, 0.15)));
	}

}
